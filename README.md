'''mermaid
graph LR
    Customer[Pelanggan] -->|HTTP Request| Gateway[API Gateway]

    Gateway -->|Request/Response| OrderSvc[Order Service]

    OrderSvc -->|Request/Response| CatalogSvc[Catalog Service]

    OrderSvc -->|Publish: OrderCreated| Broker[(Message Broker)]

    Broker -->|Subscribe: OrderCreated| PaymentSvc[Payment Service]

    PaymentSvc -->|Publish: PaymentSuccess| Broker

    Broker -->|Subscribe: PaymentSuccess| RestoSvc[Restaurant Notification Service]

    RestoSvc -->|Order diterima| Restaurant[Restoran]

    Restaurant -->|Publish: OrderReady| Broker

    Broker -->|Subscribe: OrderReady| CourierSvc[Courier Service]

    CourierSvc -->|Assign Courier| Courier[Kurir]

    CourierSvc -->|Publish: CourierAssigned| Broker

    Broker -->|Subscribe: CourierAssigned| NotifSvc[Notification Service]

    NotifSvc -->|Push Notification| Customer
'''
