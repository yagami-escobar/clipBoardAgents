
export PIP_NO_VERIFY_CERTS=1
export CURL_CA_BUNDLE=""


python3 -m venv myenv
source myenv/bin/activate
pip install azure-devops==7.0.0b4