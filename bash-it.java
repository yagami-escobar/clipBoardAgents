🚀 Cómo hacer que Bash-it autocomplete como Oh My Zsh
Si quieres que Bash recuerde y sugiera comandos previos automáticamente, necesitas instalar:
1️⃣ bash-autosuggestions → Para sugerencias de comandos anteriores.
2️⃣ bash-history-search → Para buscar comandos en el historial fácilment

git clone https://github.com/mscdex/bash-autosuggestions ~/.bash_it/custom/plugins/bash-autosuggestions
echo 'source ~/.bash_it/custom/plugins/bash-autosuggestions/bash-autosuggestions.sh' >> ~/.bashrc

bash-it enable plugin history


echo 'HISTFILESIZE=20000' >> ~/.bashrc
echo 'HISTSIZE=20000' >> ~/.bashrc
echo 'HISTCONTROL=ignoreboth:erasedups' >> ~/.bashrc
