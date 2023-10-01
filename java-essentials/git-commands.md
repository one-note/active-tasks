<div style="text-align:center">

# Git Basic Commands
</div>


1. `git init`:
    - Description: Initializes a new Git repository in the current directory. It creates a hidden `.git` folder containing all the necessary files to manage version control for your project.
    - Usage: `git init`

2. `git add`:
    - Description: Stages changes in your working directory, preparing them for the next commit. You can specify individual files or directories to stage.
    - Usage: `git add <file or directory>`

3. `git commit`:
    - Description: Records the staged changes as a new commit in the repository's history. You must provide a meaningful commit message to describe the changes.
    - Usage: `git commit -m "Your commit message"`

4. `git log`:
    - Description: Displays a detailed log of all commits in the repository, showing commit hashes, authors, dates, and commit messages. This helps you track the project's history.
    - Usage: `git log`

5. `git push`:
    - Description: Uploads your local commits to a remote repository, allowing you to share your changes with others. It updates the remote branch with your changes.
    - Usage: `git push <remote> <branch>`

6. `git pull`:
    - Description: Fetches changes from a remote repository and automatically merges them into your current branch. It updates your local branch with remote changes.
    - Usage: `git pull <remote> <branch>`

7. `git merge`:
    - Description: Combines changes from one branch (the source) into another (the target). A new merge commit is created if there are conflicting changes.
    - Usage: `git merge <source_branch>`

8. `git checkout`:
    - Description: Switches between branches, commits, or tags, allowing you to navigate through your project's history and work on different parts of your codebase.
    - Usage: `git checkout <branch/commit/tag>`

9. `git fetch`:
    - Description: Downloads changes from a remote repository without automatically merging them. It updates your local copy of the remote branch but leaves your working directory unchanged.
    - Usage: `git fetch <remote>`

10. `git cherry-pick`:
    - Description: Selectively applies changes from one commit to another branch. This command is useful when you want to incorporate specific changes without merging entire branches.
    - Usage: `git cherry-pick <commit>`

11. `git reset --soft`:
    - Description: Resets the current branch pointer to a specified commit while preserving changes in your working directory and staging area. Useful for "uncommitting" and recommitting.
    - Usage: `git reset --soft <commit>`

12. `git reset --hard`:
    - Description: Resets the current branch pointer and working directory to a specified commit, discarding all changes after that commit. Caution: This action is irreversible.
    - Usage: `git reset --hard <commit>`

13. `git revert`:
    - Description: Creates a new commit that undoes the changes introduced by a specific commit. This is a safe way to fix mistakes without altering the project's history.
    - Usage: `git revert <commit>`

These Git commands provide fine-grained control over version control and collaboration, ensuring efficient code management in software development projects.

## Examples: Git commands

1. `git init`:
    - Initialize a new Git repository in the current directory:
      ```
      git init
      ```

2. `git add`:
    - Stage a specific file for the next commit:
      ```
      git add file.txt
      ```
    - Stage all changes in the current directory and its subdirectories:
      ```
      git add .
      ```

3. `git commit`:
    - Commit staged changes with a descriptive message:
      ```
      git commit -m "Adding new feature"
      ```

4. `git log`:
    - Display a detailed commit history:
      ```
      git log
      ```

5. `git push`:
    - Push local commits to a remote repository:
      ```
      git push origin master
      ```

6. `git pull`:
    - Fetch and merge changes from a remote branch:
      ```
      git pull origin dev-module
      ```

7. `git merge`:
    - Merge changes from a feature branch into the main branch:
      ```
      git checkout main
      git merge feature-branch
      ```

8. `git checkout`:
    - Switch to a specific branch:
      ```
      git checkout feature-branch
      ```
    - Move to a specific commit:
      ```
      git checkout branch-pacthes
      ```

9. `git fetch`:
    - Fetch changes from a remote repository without merging:
      ```
      git fetch origin
      ```

10. `git cherry-pick`:
    - Apply a specific commit to the current branch:
      ```
      git cherry-pick branch-patches
      ```

11. `git reset --soft`:
    - Move the branch pointer to a previous commit, preserving changes:
      ```
      git reset --soft branch-patches
      ```

12. `git reset --hard`:
    - Move the branch pointer and working directory to a previous commit, discarding changes:
      ```
      git reset --hard branch-patches
      ```

13. `git revert`:
    - Create a new commit to undo changes introduced by a specific commit:
      ```
      git revert branch
      ```

![Screenshot 2023-10-01 141606](https://github.com/Ansu-s/need_to_study_this/assets/130679461/48b823c1-e7aa-4e26-8f8d-3582771676d8)
![Screenshot 2023-10-01 142019](https://github.com/Ansu-s/need_to_study_this/assets/130679461/4f42f9c0-e92b-423a-8331-22c2015c8b93)
