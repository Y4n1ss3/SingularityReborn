package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidView_androidKt$createAndroidViewNodeFactory$1$1 extends f30 implements iy {
    final /* synthetic */ int $compositeKeyHash;
    final /* synthetic */ Context $context;
    final /* synthetic */ ky $factory;
    final /* synthetic */ View $ownerView;
    final /* synthetic */ CompositionContext $parentReference;
    final /* synthetic */ SaveableStateRegistry $stateRegistry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$createAndroidViewNodeFactory$1$1(Context context, ky kyVar, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i, View view) {
        super(0);
        this.$context = context;
        this.$factory = kyVar;
        this.$parentReference = compositionContext;
        this.$stateRegistry = saveableStateRegistry;
        this.$compositeKeyHash = i;
        this.$ownerView = view;
    }

    @Override // defpackage.iy
    public final LayoutNode invoke() {
        Context context = this.$context;
        ky kyVar = this.$factory;
        CompositionContext compositionContext = this.$parentReference;
        SaveableStateRegistry saveableStateRegistry = this.$stateRegistry;
        int i = this.$compositeKeyHash;
        KeyEvent.Callback callback = this.$ownerView;
        callback.getClass();
        return new ViewFactoryHolder(context, kyVar, compositionContext, saveableStateRegistry, i, (Owner) callback).getLayoutNode();
    }
}
