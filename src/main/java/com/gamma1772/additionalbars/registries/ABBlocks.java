package com.gamma1772.additionalbars.registries;

import com.gamma1772.additionalbars.AdditionalBars;
import com.gamma1772.additionalbars.content.block.*;
import com.google.common.collect.BiMap;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.Properties;

/**
 * @method createBarsBlock()
 *      - creates general 'attributes' for each block where it's called
 *
 * @method createBarsBlock(Material material, MaterialColor color, SoundType sound)
 *      - creates a block with specific material, color and sound type
 *
 * @method createBarsBlock(Material material, MaterialColor color, SoundType sound, ToolType tool, float hardness, float resistance)
 *      - lets dev define every attribute of a block
 *
 *  Same as above, but for horizontal bars
 * @method createHorizontalBarsBlock()
 * @method createHorizontalBarsBlock(Material material, MaterialColor color, SoundType sound)
 * @method createHorizontalBarsBlock(Material material, MaterialColor color, SoundType sound, ToolType tool, float hardness, float resistance)
 *
 * universal attributes are the ones that need to be for every created block of this type, for example, every block here has to let light pass through,
 * so each block has #setOpaque and #setBlockVision set to special predicate
 * */
public class ABBlocks
{
    public BiMap<OxidizableBarsBlock, OxidizableBarsBlock> weatherableBlocksIncrease;
    public BiMap<OxidizableBarsBlock, OxidizableBarsBlock> weatherableBlocksDecrease;

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdditionalBars.MODID);
    public static final RegistryObject<Block> GOLD_BARS                         = BLOCKS.register("gold_bars", () -> createBarsBlock(Material.METAL, MaterialColor.GOLD, SoundType.METAL, 5.0f, 6.0f, BarsType.REGULAR, BarsType.METAL));
    public static final RegistryObject<Block> ACACIA_BARS                       = BLOCKS.register("acacia_bars", () -> createBarsBlock(Material.METAL, MaterialColor.WOOD, SoundType.METAL, 5.0f, 6.0f, BarsType.REGULAR, BarsType.WOOD));
    public static final RegistryObject<Block> BIRCH_BARS                        = BLOCKS.register("birch_bars", () -> createBarsBlock(Material.WOOD, MaterialColor.WOOD, SoundType.WOOD, 5.0f, 6.0f, BarsType.REGULAR, BarsType.WOOD));
    public static final RegistryObject<Block> JUNGLE_BARS                       = BLOCKS.register("jungle_bars", () -> createBarsBlock(Material.WOOD, MaterialColor.WOOD, SoundType.WOOD, 5.0f, 6.0f, BarsType.REGULAR, BarsType.WOOD));
    public static final RegistryObject<Block> OAK_BARS                          = BLOCKS.register("oak_bars", () -> createBarsBlock(Material.WOOD, MaterialColor.WOOD, SoundType.WOOD, 5.0f, 6.0f, BarsType.REGULAR, BarsType.WOOD));
    public static final RegistryObject<Block> DARK_OAK_BARS                     = BLOCKS.register("dark_oak_bars", () -> createBarsBlock(Material.WOOD, MaterialColor.WOOD, SoundType.WOOD, 5.0f, 6.0f, BarsType.REGULAR, BarsType.WOOD));
    public static final RegistryObject<Block> SPRUCE_BARS                       = BLOCKS.register("spruce_bars", () -> createBarsBlock(Material.WOOD, MaterialColor.WOOD, SoundType.WOOD, 5.0f, 6.0f, BarsType.REGULAR, BarsType.WOOD));
    public static final RegistryObject<Block> MANGROVE_BARS                     = BLOCKS.register("mangrove_bars", () -> createBarsBlock(Material.WOOD, MaterialColor.WOOD, SoundType.WOOD, 5.0f, 6.0f, BarsType.REGULAR, BarsType.WOOD));
    public static final RegistryObject<Block> CRIMSON_BARS                      = BLOCKS.register("crimson_bars", () -> createBarsBlock(Material.NETHER_WOOD, MaterialColor.CRIMSON_NYLIUM, SoundType.NYLIUM, BarsType.REGULAR, BarsType.NETHER));
    public static final RegistryObject<Block> WARPED_BARS                       = BLOCKS.register("warped_bars", () -> createBarsBlock(Material.NETHER_WOOD, MaterialColor.WARPED_NYLIUM, SoundType.NYLIUM, BarsType.REGULAR, BarsType.NETHER));

    public static final RegistryObject<Block> CROSSED_IRON_BARS                 = BLOCKS.register("crossed_iron_bars", () -> createBarsBlock(Material.METAL, MaterialColor.METAL, SoundType.METAL, 5.0f, 6.0f, BarsType.CROSSED, BarsType.METAL));
    public static final RegistryObject<Block> CROSSED_GOLD_BARS                 = BLOCKS.register("crossed_gold_bars", () -> createBarsBlock(Material.METAL, MaterialColor.GOLD, SoundType.METAL, 5.0f, 6.0f, BarsType.CROSSED, BarsType.METAL));
    public static final RegistryObject<Block> CROSSED_ACACIA_BARS               = BLOCKS.register("crossed_acacia_bars", () -> createBarsBlock(BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> CROSSED_BIRCH_BARS                = BLOCKS.register("crossed_birch_bars", () -> createBarsBlock(BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> CROSSED_JUNGLE_BARS               = BLOCKS.register("crossed_jungle_bars", () -> createBarsBlock(BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> CROSSED_OAK_BARS                  = BLOCKS.register("crossed_oak_bars", () -> createBarsBlock(BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> CROSSED_DARK_OAK_BARS             = BLOCKS.register("crossed_dark_oak_bars", () -> createBarsBlock(BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> CROSSED_SPRUCE_BARS               = BLOCKS.register("crossed_spruce_bars", () -> createBarsBlock(BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> CROSSED_MANGROVE_BARS             = BLOCKS.register("crossed_mangrove_bars", () -> createBarsBlock(BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> CROSSED_CRIMSON_BARS              = BLOCKS.register("crossed_crimson_bars", () -> createBarsBlock(Material.NETHER_WOOD, MaterialColor.CRIMSON_NYLIUM, SoundType.NYLIUM, BarsType.CROSSED, BarsType.NETHER));
    public static final RegistryObject<Block> CROSSED_WARPED_BARS               = BLOCKS.register("crossed_warped_bars", () -> createBarsBlock(Material.NETHER_WOOD, MaterialColor.WARPED_NYLIUM, SoundType.NYLIUM, BarsType.CROSSED, BarsType.NETHER));

    public static final RegistryObject<Block> HORIZONTAL_IRON_BARS              = BLOCKS.register("horizontal_iron_bars", () -> createHorizontalBarsBlock(Material.METAL, MaterialColor.METAL, SoundType.METAL, 5.0f, 6.0f, BarsType.HORIZONTAL, BarsType.METAL));
    public static final RegistryObject<Block> HORIZONTAL_GOLD_BARS              = BLOCKS.register("horizontal_gold_bars", () -> createHorizontalBarsBlock(Material.METAL, MaterialColor.GOLD, SoundType.METAL, 5.0f, 6.0f, BarsType.HORIZONTAL, BarsType.METAL));
    public static final RegistryObject<Block> HORIZONTAL_ACACIA_BARS            = BLOCKS.register("horizontal_acacia_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_BIRCH_BARS             = BLOCKS.register("horizontal_birch_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_JUNGLE_BARS            = BLOCKS.register("horizontal_jungle_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_OAK_BARS               = BLOCKS.register("horizontal_oak_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_DARK_OAK_BARS          = BLOCKS.register("horizontal_dark_oak_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_SPRUCE_BARS            = BLOCKS.register("horizontal_spruce_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_MANGROVE_BARS            = BLOCKS.register("horizontal_mangrove_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_CRIMSON_BARS           = BLOCKS.register("horizontal_crimson_bars", () -> createHorizontalBarsBlock(Material.NETHER_WOOD, MaterialColor.CRIMSON_NYLIUM, SoundType.NYLIUM, BarsType.HORIZONTAL, BarsType.NETHER));
    public static final RegistryObject<Block> HORIZONTAL_WARPED_BARS            = BLOCKS.register("horizontal_warped_bars", () -> createHorizontalBarsBlock(Material.NETHER_WOOD, MaterialColor.WARPED_NYLIUM, SoundType.NYLIUM, BarsType.HORIZONTAL, BarsType.NETHER));

    public static final RegistryObject<Block> HORIZONTAL_CROSSED_IRON_BARS      = BLOCKS.register("horizontal_crossed_iron_bars", () -> createHorizontalBarsBlock(Material.METAL, MaterialColor.METAL, SoundType.METAL, 5.0f, 6.0f, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_GOLD_BARS      = BLOCKS.register("horizontal_crossed_gold_bars", () -> createHorizontalBarsBlock(Material.METAL, MaterialColor.GOLD, SoundType.METAL, 5.0f, 6.0f, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_ACACIA_BARS    = BLOCKS.register("horizontal_crossed_acacia_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_BIRCH_BARS     = BLOCKS.register("horizontal_crossed_birch_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_JUNGLE_BARS    = BLOCKS.register("horizontal_crossed_jungle_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_OAK_BARS       = BLOCKS.register("horizontal_crossed_oak_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_DARK_OAK_BARS  = BLOCKS.register("horizontal_crossed_dark_oak_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_SPRUCE_BARS    = BLOCKS.register("horizontal_crossed_spruce_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_MANGROVE_BARS    = BLOCKS.register("horizontal_crossed_mangrove_bars", () -> createHorizontalBarsBlock(BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_CRIMSON_BARS   = BLOCKS.register("horizontal_crossed_crimson_bars", () -> createHorizontalBarsBlock(Material.NETHER_WOOD, MaterialColor.CRIMSON_NYLIUM, SoundType.NYLIUM, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.NETHER));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_WARPED_BARS    = BLOCKS.register("horizontal_crossed_warped_bars", () -> createHorizontalBarsBlock(Material.NETHER_WOOD, MaterialColor.WARPED_NYLIUM, SoundType.NYLIUM, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.NETHER));

    public static final RegistryObject<OxidizableBarsBlock> OXIDIZED_COPPER_BARS = BLOCKS.register("oxidized_copper_bars", () -> createCopperBars(WeatherState.OXIDIZED, false, BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING));
    public static final RegistryObject<OxidizableBarsBlock> WEATHERED_COPPER_BARS = BLOCKS.register("weathered_copper_bars", () -> createCopperBars(WeatherState.WEATHERED, true, BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING));
    public static final RegistryObject<OxidizableBarsBlock> EXPOSED_COPPER_BARS = BLOCKS.register("exposed_copper_bars", () -> createCopperBars(WeatherState.EXPOSED, true, BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING));
    public static final RegistryObject<OxidizableBarsBlock> COPPER_BARS = BLOCKS.register("copper_bars", () -> createCopperBars(WeatherState.UNAFFECTED, true, BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING));


    public static final RegistryObject<OxidizableBarsBlock> CROSSED_COPPER_BARS = BLOCKS.register("crossed_copper_bars", () -> createCopperBars(WeatherState.UNAFFECTED, true, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));
    public static final RegistryObject<OxidizableBarsBlock> CROSSED_EXPOSED_COPPER_BARS = BLOCKS.register("crossed_exposed_copper_bars", () -> createCopperBars(WeatherState.EXPOSED, true, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));
    public static final RegistryObject<OxidizableBarsBlock> CROSSED_WEATHERED_COPPER_BARS = BLOCKS.register("crossed_weathered_copper_bars", () -> createCopperBars(WeatherState.WEATHERED, true, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));
    public static final RegistryObject<OxidizableBarsBlock> CROSSED_OXIDIZED_COPPER_BARS = BLOCKS.register("crossed_oxidized_copper_bars", () -> createCopperBars(WeatherState.OXIDIZED, false, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));

    public static final RegistryObject<Block> HORIZONTAL_COPPER_BARS = BLOCKS.register("horizontal_copper_bars", () -> createHorizontalCopperBars(WeatherState.UNAFFECTED, true, BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING));
    public static final RegistryObject<Block> HORIZONTAL_EXPOSED_COPPER_BARS = BLOCKS.register("horizontal_exposed_copper_bars", () -> createHorizontalCopperBars(WeatherState.EXPOSED, true, BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING));
    public static final RegistryObject<Block> HORIZONTAL_WEATHERED_COPPER_BARS = BLOCKS.register("horizontal_weathered_copper_bars", () -> createHorizontalCopperBars(WeatherState.WEATHERED, true, BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING));
    public static final RegistryObject<Block> HORIZONTAL_OXIDIZED_COPPER_BARS = BLOCKS.register("horizontal_oxidized_copper_bars", () -> createHorizontalCopperBars(WeatherState.OXIDIZED, false, BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING));

    public static final RegistryObject<Block> HORIZONTAL_CROSSED_COPPER_BARS = BLOCKS.register("horizontal_crossed_copper_bars", () -> createHorizontalCopperBars(WeatherState.UNAFFECTED, true, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = BLOCKS.register("horizontal_crossed_exposed_copper_bars", () -> createHorizontalCopperBars(WeatherState.EXPOSED, true, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = BLOCKS.register("horizontal_crossed_weathered_copper_bars", () -> createHorizontalCopperBars(WeatherState.WEATHERED, true, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = BLOCKS.register("horizontal_crossed_oxidized_copper_bars", () -> createHorizontalCopperBars(WeatherState.OXIDIZED, false, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));

    public static final RegistryObject<WaxedBarsBlock> WAXED_COPPER_BARS = BLOCKS.register("waxed_copper_bars", () -> createWaxedBars(COPPER_BARS.get(), BarsType.REGULAR, BarsType.METAL, BarsType.WAXED));
    public static final RegistryObject<WaxedBarsBlock> WAXED_EXPOSED_COPPER_BARS = BLOCKS.register("waxed_exposed_copper_bars", () -> createWaxedBars(EXPOSED_COPPER_BARS.get(), BarsType.REGULAR, BarsType.METAL, BarsType.WAXED));
    public static final RegistryObject<WaxedBarsBlock> WAXED_WEATHERED_COPPER_BARS = BLOCKS.register("waxed_weathered_copper_bars", () -> createWaxedBars(WEATHERED_COPPER_BARS.get(), BarsType.REGULAR, BarsType.METAL, BarsType.WAXED));
    public static final RegistryObject<WaxedBarsBlock> WAXED_OXIDIZED_COPPER_BARS = BLOCKS.register("waxed_oxidized_copper_bars", () -> createWaxedBars(OXIDIZED_COPPER_BARS.get(), BarsType.REGULAR, BarsType.METAL, BarsType.WAXED));

    public static final RegistryObject<WaxedBarsBlock> WAXED_CROSSED_COPPER_BARS = BLOCKS.register("waxed_crossed_copper_bars", () -> createWaxedBars(CROSSED_COPPER_BARS.get(), BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));
    public static final RegistryObject<WaxedBarsBlock> WAXED_CROSSED_EXPOSED_COPPER_BARS = BLOCKS.register("waxed_crossed_exposed_copper_bars", () -> createWaxedBars(CROSSED_EXPOSED_COPPER_BARS.get(), BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));
    public static final RegistryObject<WaxedBarsBlock> WAXED_CROSSED_WEATHERED_COPPER_BARS = BLOCKS.register("waxed_crossed_weathered_copper_bars", () -> createWaxedBars(CROSSED_WEATHERED_COPPER_BARS.get(), BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));
    public static final RegistryObject<WaxedBarsBlock> WAXED_CROSSED_OXIDIZED_COPPER_BARS = BLOCKS.register("waxed_crossed_oxidized_copper_bars", () -> createWaxedBars(CROSSED_OXIDIZED_COPPER_BARS.get(), BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));

    public static final RegistryObject<Block> WAXED_HORIZONTAL_COPPER_BARS = BLOCKS.register("waxed_horizontal_copper_bars", () -> createHorizontalCopperBars(WeatherState.UNAFFECTED, false, BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED));
    public static final RegistryObject<Block> WAXED_HORIZONTAL_EXPOSED_COPPER_BARS = BLOCKS.register("waxed_horizontal_exposed_copper_bars", () -> createHorizontalCopperBars(WeatherState.EXPOSED, false, BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED));
    public static final RegistryObject<Block> WAXED_HORIZONTAL_WEATHERED_COPPER_BARS = BLOCKS.register("waxed_horizontal_weathered_copper_bars", () -> createHorizontalCopperBars(WeatherState.WEATHERED, false, BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED));
    public static final RegistryObject<Block> WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS = BLOCKS.register("waxed_horizontal_oxidized_copper_bars", () -> createHorizontalCopperBars(WeatherState.OXIDIZED, false, BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED));

    public static final RegistryObject<Block> WAXED_HORIZONTAL_CROSSED_COPPER_BARS = BLOCKS.register("waxed_horizontal_crossed_copper_bars", () -> createHorizontalCopperBars(WeatherState.UNAFFECTED, false, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));
    public static final RegistryObject<Block> WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = BLOCKS.register("waxed_horizontal_crossed_exposed_copper_bars", () -> createHorizontalCopperBars(WeatherState.EXPOSED, false, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));
    public static final RegistryObject<Block> WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = BLOCKS.register("waxed_horizontal_crossed_weathered_copper_bars", () -> createHorizontalCopperBars(WeatherState.WEATHERED, false, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));
    public static final RegistryObject<Block> WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = BLOCKS.register("waxed_horizontal_crossed_oxidized_copper_bars", () -> createHorizontalCopperBars(WeatherState.OXIDIZED, false, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));

//    static {
//        COPPER_BARS.get().setBlocks(null, EXPOSED_COPPER_BARS.get(), WAXED_COPPER_BARS.get());
//        EXPOSED_COPPER_BARS.get().setBlocks(COPPER_BARS.get(), WEATHERED_COPPER_BARS.get(), WAXED_EXPOSED_COPPER_BARS.get());
//        WEATHERED_COPPER_BARS.get().setBlocks(EXPOSED_COPPER_BARS.get(), OXIDIZED_COPPER_BARS.get(), WAXED_WEATHERED_COPPER_BARS.get());
//        OXIDIZED_COPPER_BARS.get().setBlocks(WEATHERED_COPPER_BARS.get(), null, WAXED_OXIDIZED_COPPER_BARS.get());
//    }

    private static BasicBarsBlock createBarsBlock(BlockType... types) {
        return new BasicBarsBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).requiresCorrectToolForDrops().strength(3.0F, 4.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never), types);
    }

    private static BasicBarsBlock createBarsBlock(Material material, MaterialColor color, SoundType sound, BlockType... types) {
        return new BasicBarsBlock(Block.Properties.of(material, color).sound(sound).strength(3.0f, 4.0f).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never), types);
    }

    private static BasicBarsBlock createBarsBlock(Material material, MaterialColor color, SoundType sound, float hardness, float resistance, BlockType... types) {
        return new BasicBarsBlock(Block.Properties.of(material, color).sound(sound).strength(hardness, resistance).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never), types);
    }

    private static HorizontalPaneBlock createHorizontalBarsBlock(BlockType... types) {
        return new HorizontalPaneBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).strength(3.0F, 4.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never), types);
    }

    private static HorizontalPaneBlock createHorizontalBarsBlock(Material material, MaterialColor color, SoundType sound, BlockType... types) {
        return new HorizontalPaneBlock(Block.Properties.of(material, color).sound(sound).strength(3.0f, 4.0f).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never), types);
    }

    private static HorizontalPaneBlock createHorizontalBarsBlock(Material material, MaterialColor color, SoundType sound, float hardness, float resistance, BlockType... types) {
        return new HorizontalPaneBlock(Block.Properties.of(material, color).sound(sound).strength(hardness, resistance).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never), types);
    }

    private static OxidizableBarsBlock createCopperBars(WeatherState state, boolean ticksRandomly, BlockType... types) {
        if (ticksRandomly)
            return new OxidizableBarsBlock(state, Block.Properties.of(Material.METAL, MaterialColor.METAL).sound(SoundType.COPPER).strength(5.0F, 6.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never).randomTicks(), types);
        else
            return new OxidizableBarsBlock(state, Block.Properties.of(Material.METAL, MaterialColor.METAL).sound(SoundType.COPPER).strength(5.0F, 6.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never), types);
    }

    public static WaxedBarsBlock createWaxedBars(OxidizableBarsBlock oxidizableBlock, BlockType... types) {
        return new WaxedBarsBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).sound(SoundType.COPPER).strength(5.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never), oxidizableBlock, types);
    }

    private static HorizontalOxidizableBarsBlock createHorizontalCopperBars(WeatherState state, boolean ticksRandomly, BlockType... types) {
        if (ticksRandomly)
            return new HorizontalOxidizableBarsBlock(state, Block.Properties.of(Material.METAL, MaterialColor.METAL).sound(SoundType.COPPER).strength(5.0F, 6.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never).randomTicks(), types);
        else
            return new HorizontalOxidizableBarsBlock(state, Block.Properties.of(Material.METAL, MaterialColor.METAL).sound(SoundType.COPPER).strength(5.0F, 6.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never), types);
    }

    private static BasicBarsBlock createBarsBlock() {
        return new BasicBarsBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).requiresCorrectToolForDrops().strength(3.0F, 4.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never), BarsType.REGULAR);
    }

    private static BasicBarsBlock createBarsBlock(Material material, MaterialColor color, SoundType sound) {
        return new BasicBarsBlock(Block.Properties.of(material, color).sound(sound).strength(3.0f, 4.0f).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never));
    }

    private static BasicBarsBlock createBarsBlock(Material material, MaterialColor color, SoundType sound, float hardness, float resistance) {
        return new BasicBarsBlock(Block.Properties.of(material, color).sound(sound).strength(hardness, resistance).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never));
    }

    private static HorizontalPaneBlock createHorizontalBarsBlock() {
        return new HorizontalPaneBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).strength(3.0F, 4.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never));
    }

    private static HorizontalPaneBlock createHorizontalBarsBlock(Material material, MaterialColor color, SoundType sound) {
        return new HorizontalPaneBlock(Block.Properties.of(material, color).sound(sound).strength(3.0f, 4.0f).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never));
    }

    private static HorizontalPaneBlock createHorizontalBarsBlock(Material material, MaterialColor color, SoundType sound, float hardness, float resistance) {
        return new HorizontalPaneBlock(Block.Properties.of(material, color).sound(sound).strength(hardness, resistance).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never));
    }

    private static OxidizableBarsBlock createCopperBars(WeatherState state, boolean ticksRandomly) {
        if (ticksRandomly)
            return new OxidizableBarsBlock(state, Block.Properties.of(Material.METAL, MaterialColor.METAL).sound(SoundType.COPPER).strength(5.0F, 6.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never).randomTicks());
        else
            return new OxidizableBarsBlock(state, Block.Properties.of(Material.METAL, MaterialColor.METAL).sound(SoundType.COPPER).strength(5.0F, 6.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never));
    }

    private static HorizontalOxidizableBarsBlock createHorizontalCopperBars(WeatherState state, boolean ticksRandomly) {
        if (ticksRandomly)
            return new HorizontalOxidizableBarsBlock(state, Block.Properties.of(Material.METAL, MaterialColor.METAL).sound(SoundType.COPPER).strength(5.0F, 6.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never).randomTicks());
        else
            return new HorizontalOxidizableBarsBlock(state, Block.Properties.of(Material.METAL, MaterialColor.METAL).sound(SoundType.COPPER).strength(5.0F, 6.0F).noOcclusion().isValidSpawn(ABBlocks::never).isViewBlocking(ABBlocks::never).isSuffocating(ABBlocks::never).isRedstoneConductor(ABBlocks::never));
    }

    private static Boolean never(BlockState blockState, BlockGetter blockView, BlockPos blockPos, EntityType<?> entityType) { return false; }
    private static boolean never(BlockState blockState, BlockGetter blockView, BlockPos blockPos) { return false; }
}

