package androidx.compose.ui.graphics;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerV29;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import androidx.compose.ui.graphics.shadow.AndroidShadowContext_androidKt;
import androidx.compose.ui.graphics.shadow.ShadowContext;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AndroidGraphicsContext implements GraphicsContext {
    public static final Companion Companion = new Companion(null);
    private static boolean isRenderNodeCompatible = true;
    private boolean componentCallbackRegistered;
    private final ViewGroup ownerView;
    private ShadowContext shadowCache;
    private DrawChildContainer viewLayerContainer;
    private final Object lock = new Object();
    private final ComponentCallbacks2 componentCallback = new ComponentCallbacks2() { // from class: androidx.compose.ui.graphics.AndroidGraphicsContext.1
        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i >= 40) {
                AndroidGraphicsContext.this.clearShadowCache();
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }
    };

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        public static final long getUniqueDrawingId(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public AndroidGraphicsContext(ViewGroup viewGroup) {
        this.ownerView = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            registerComponentCallback(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.graphics.AndroidGraphicsContext.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                AndroidGraphicsContext.this.registerComponentCallback(view.getContext());
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AndroidGraphicsContext.this.unregisterComponentCallback(view.getContext());
                AndroidGraphicsContext.this.clearShadowCache();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearShadowCache() {
        ShadowContext shadowContext = this.shadowCache;
        if (shadowContext != null) {
            shadowContext.clearCache();
        }
        this.shadowCache = null;
    }

    private final long getUniqueDrawingId(View view) {
        return UniqueDrawingIdApi29.getUniqueDrawingId(view);
    }

    private final DrawChildContainer obtainViewLayerContainer(ViewGroup viewGroup) {
        DrawChildContainer drawChildContainer = this.viewLayerContainer;
        if (drawChildContainer != null) {
            return drawChildContainer;
        }
        ViewLayerContainer viewLayerContainer = new ViewLayerContainer(viewGroup.getContext());
        viewGroup.addView(viewLayerContainer);
        this.viewLayerContainer = viewLayerContainer;
        return viewLayerContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerComponentCallback(Context context) {
        if (this.componentCallbackRegistered) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.componentCallback);
        this.componentCallbackRegistered = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterComponentCallback(Context context) {
        if (this.componentCallbackRegistered) {
            context.getApplicationContext().unregisterComponentCallbacks(this.componentCallback);
            this.componentCallbackRegistered = false;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public GraphicsLayer createGraphicsLayer() {
        GraphicsLayer graphicsLayer;
        synchronized (this.lock) {
            graphicsLayer = new GraphicsLayer(new GraphicsLayerV29(getUniqueDrawingId(this.ownerView), null, null, 6, null));
        }
        return graphicsLayer;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public ShadowContext getShadowContext() {
        ShadowContext shadowContext = this.shadowCache;
        if (shadowContext != null) {
            return shadowContext;
        }
        ShadowContext ShadowContext = AndroidShadowContext_androidKt.ShadowContext();
        this.shadowCache = ShadowContext;
        return ShadowContext;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public void releaseGraphicsLayer(GraphicsLayer graphicsLayer) {
        synchronized (this.lock) {
            graphicsLayer.release$ui_graphics();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final boolean isRenderNodeCompatible() {
            return AndroidGraphicsContext.isRenderNodeCompatible;
        }

        public final void setRenderNodeCompatible(boolean z) {
            AndroidGraphicsContext.isRenderNodeCompatible = z;
        }

        private Companion() {
        }
    }
}
