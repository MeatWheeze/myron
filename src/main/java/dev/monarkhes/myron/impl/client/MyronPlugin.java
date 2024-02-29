//package dev.monarkhes.myron.impl.client;
//
//import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
//import net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin;
//import net.minecraft.client.MinecraftClient;
//import net.minecraft.resource.ResourceManager;
//import net.minecraft.util.Identifier;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.Executor;
//
//public class MyronPlugin implements PreparableModelLoadingPlugin<MyronPlugin.Thing>
//{
//    private final MinecraftClient client = MinecraftClient.getInstance();
//    private final ResourceManager manager = client.getResourceManager();
//
//    static CompletableFuture<Thing> loader(ResourceManager manager, Executor executor)
//    {
//        return CompletableFuture.supplyAsync(Thing::new);
//    }
////    @Override
////    public void onInitializeModelLoader(Context pluginContext)
////    {
////        pluginContext.resolveModel().register(context ->
////        {
////
////            Collection<Identifier> candidates = new ArrayList<>();
////            candidates.addAll(context.loader()..findResources("models/block", path -> true).keySet());
////            candidates.addAll(manager.findResources("models/item", path -> true).keySet());
////            candidates.addAll(manager.findResources("models/misc", path -> true).keySet());
////        });
////    }
//
//    @Override
//    public void onInitializeModelLoader(Thing data, ModelLoadingPlugin.Context pluginContext)
//    {
////        pluginContext.registerBlockStateResolver();
//        pluginContext.resolveModel().register(context ->
//        {
//            Collection<Identifier> ids = new HashSet<>();
//
//            Collection<Identifier> candidates = new ArrayList<>();
//            candidates.addAll(manager.findResources("models/block", path -> true).keySet());
//            candidates.addAll(manager.findResources("models/item", path -> true).keySet());
//            candidates.addAll(manager.findResources("models/misc", path -> true).keySet());
//
//            for (Identifier id : candidates)
//            {
//                if (id.getPath().endsWith(".obj"))
//                {
//                    ids.add(id);
//                    ids.add(new Identifier(id.getNamespace(), id.getPath().substring(0, id.getPath().indexOf(".obj"))));
//                }
//                else
//                {
//                    Identifier test = new Identifier(id.getNamespace(), id.getPath() + ".obj");
//
//                    if (manager.getResource(test).isPresent())
//                    {
//                        ids.add(id);
//                    }
//                }
//            }
//
//            ids.forEach(id ->
//            {
//                String path = id.getPath();
//
//                if (path.startsWith("models/"))
//                {
//                    out.accept(new Identifier(id.getNamespace(), path.substring("models/".length())));
//                }
//
//                out.accept(id);
//            }
//            );
//        });
//    }
//
//    record Thing()
//    {
//
//    }
//
//}
