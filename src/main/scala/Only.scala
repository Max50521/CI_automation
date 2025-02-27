case class Only( // Класс Only представляет собой условия, при которых задача будет выполнена.
                 refs: List[String], //обязательное поле, содержащее список веток, на которых задача будет выполнена.
                 kubernetes: Option[Boolean] = None, //опциональное поле, указывающее, должна ли задача выполняться на кластере Kubernetes.
                 variables: Option[List[Variables]]= None, //опциональное поле, содержащее список переменных, которые должны быть установлены для выполнения задачи.
                 changes: Option[List[String]]= None
               )