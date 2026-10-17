package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.lumi.singularity.R;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class fk extends Dialog implements y40, td0, hl0 {
    private a50 _lifecycleRegistry;
    private final rd0 onBackPressedDispatcher;
    private final fl0 savedStateRegistryController;

    public fk(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, 0);
        this.savedStateRegistryController = new fl0(new gl0(this, new i2(this, 28)));
        this.onBackPressedDispatcher = new rd0(new j(this, 4));
    }

    public static final void b(fk fkVar) {
        super.onBackPressed();
    }

    public final a50 a() {
        a50 a50Var = this._lifecycleRegistry;
        if (a50Var != null) {
            return a50Var;
        }
        a50 a50Var2 = new a50(this, true);
        this._lifecycleRegistry = a50Var2;
        return a50Var2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.y40
    public s40 getLifecycle() {
        return a();
    }

    @Override // defpackage.td0
    public final rd0 getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // defpackage.hl0
    public el0 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            rd0 rd0Var = this.onBackPressedDispatcher;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            rd0Var.getClass();
            rd0Var.e = onBackInvokedDispatcher;
            rd0Var.c(rd0Var.g);
        }
        this.savedStateRegistryController.a(bundle);
        a().e(q40.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.savedStateRegistryController.b(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        a().e(q40.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        a().e(q40.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
