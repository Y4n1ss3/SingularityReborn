package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class ek {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(vu0 vu0Var, my myVar) {
        View childAt = ((ViewGroup) vu0Var.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(myVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(vu0Var, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(myVar);
        View decorView = vu0Var.getWindow().getDecorView();
        if (q10.o(decorView) == null) {
            decorView.setTag(com.lumi.singularity.R.id.view_tree_lifecycle_owner, vu0Var);
        }
        if (p01.n(decorView) == null) {
            decorView.setTag(com.lumi.singularity.R.id.view_tree_view_model_store_owner, vu0Var);
        }
        if (y80.t(decorView) == null) {
            decorView.setTag(com.lumi.singularity.R.id.view_tree_saved_state_registry_owner, vu0Var);
        }
        vu0Var.setContentView(composeView2, a);
    }
}
