
// Extrae el Cert del proxy o server especificos
openssl s_client -showcerts -connect management.azure.com:443 </dev/null 2>/dev/null | openssl x509 -outform PEM > my-cert.pem

// Extra el Cert sin procesarlo
openssl s_client -showcerts -connect management.azure.com:443 </dev/null


// Extraa Root Cert(Fortinet) 
openssl s_client -showcerts -connect management.azure.com:443 </dev/null 2>/dev/null | awk '/-----BEGIN CERTIFICATE-----/,/-----END CERTIFICATE-----/' > fortinet_cert.pem

// Add Cert a los CA:
sudo cp fortinet_cert.pem /usr/local/share/ca-certificates/fortinet_cert.crt
sudo update-ca-certificates
