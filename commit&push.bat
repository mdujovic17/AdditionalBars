@echo off 
echo BEGIN GIT PUSH
git add *
git commit -m "bump"
git push
echo END GIT PUSH
echo Press any key to continue...
pause > nul
@echo on