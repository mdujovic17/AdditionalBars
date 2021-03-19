echo off BEGIN GIT PUSH
git add *
git commit -m "bump"
git push
echo off END GIT PUSH
echo off Press any key to continue...
pause > nul