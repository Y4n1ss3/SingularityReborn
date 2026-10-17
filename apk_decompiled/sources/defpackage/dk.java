package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.lumi.singularity.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class dk extends Activity implements a21, hl0, td0, y40 {
    public final a50 d = new a50(this, true);
    public final rl e;
    public final p7 f;
    public final a50 g;
    public final fl0 h;
    public t60 i;
    public rd0 j;
    public final ck k;
    public final hy l;
    public final AtomicInteger m;
    public final yj n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public boolean t;
    public boolean u;

    public dk() {
        rl rlVar = new rl();
        this.e = rlVar;
        vu0 vu0Var = (vu0) this;
        int i = 0;
        this.f = new p7(7, false);
        a50 a50Var = new a50(this, true);
        this.g = a50Var;
        gl0 gl0Var = new gl0(this, new i2(this, 28));
        fl0 fl0Var = new fl0(gl0Var);
        this.h = fl0Var;
        this.j = null;
        ck ckVar = new ck(vu0Var);
        this.k = ckVar;
        this.l = new hy(ckVar, new vj(vu0Var, i));
        this.m = new AtomicInteger();
        this.n = new yj(vu0Var);
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.t = false;
        this.u = false;
        a50Var.a(new zj(vu0Var, i));
        a50Var.a(new zj(vu0Var, 1));
        a50Var.a(new zj(vu0Var, 2));
        gl0Var.a();
        r40 r40Var = a50Var.d;
        if (r40Var != r40.e && r40Var != r40.f) {
            o.m("Failed requirement.");
            throw null;
        }
        if (fl0Var.b.b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            al0 al0Var = new al0(fl0Var.b, vu0Var);
            fl0Var.b.c("androidx.lifecycle.internal.SavedStateHandlesProvider", al0Var);
            a50Var.a(new di0(al0Var, 3));
        }
        fl0Var.b.c("android:support:activity-result", new wj(vu0Var, i));
        xj xjVar = new xj(vu0Var);
        if (rlVar.b != null) {
            xjVar.a();
        }
        rlVar.a.add(xjVar);
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        this.k.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public final t60 c() {
        if (getApplication() == null) {
            o.f("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        t60 t60Var = this.i;
        if (t60Var != null) {
            return t60Var;
        }
        bk bkVar = (bk) getLastNonConfigurationInstance();
        if (bkVar != null) {
            this.i = bkVar.a;
        }
        t60 t60Var2 = this.i;
        if (t60Var2 != null) {
            return t60Var2;
        }
        t60 t60Var3 = new t60(1);
        this.i = t60Var3;
        return t60Var3;
    }

    public final void d() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int i = u11.a;
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int i = u11.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public final void e(Bundle bundle) {
        super.onCreate(bundle);
        int i = si0.d;
        qi0.b(this);
    }

    public final void f(Bundle bundle) {
        bundle.getClass();
        a50 a50Var = this.d;
        a50Var.d("setCurrentState");
        a50Var.f(r40.f);
        super.onSaveInstanceState(bundle);
    }

    public final y1 g(v1 v1Var, u1 u1Var) {
        String str = "activity_rq#" + this.m.getAndIncrement();
        yj yjVar = this.n;
        HashMap hashMap = yjVar.c;
        a50 a50Var = this.g;
        if (a50Var.d.compareTo(r40.g) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            r40 r40Var = a50Var.d;
            sb.append(" is attempting to register while current state is ");
            sb.append(r40Var);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString());
        }
        yjVar.c(str);
        a2 a2Var = (a2) hashMap.get(str);
        if (a2Var == null) {
            a2Var = new a2(a50Var);
        }
        x1 x1Var = new x1(yjVar, str, u1Var, v1Var);
        a2Var.a.a(x1Var);
        a2Var.b.add(x1Var);
        hashMap.put(str, a2Var);
        return new y1(yjVar, str, v1Var, 0);
    }

    @Override // defpackage.y40
    public final s40 getLifecycle() {
        return this.g;
    }

    @Override // defpackage.td0
    public final rd0 getOnBackPressedDispatcher() {
        if (this.j == null) {
            this.j = new rd0(new xe(this, 1));
            this.g.a(new di0(this, 1));
        }
        return this.j;
    }

    @Override // defpackage.hl0
    public final el0 getSavedStateRegistry() {
        return this.h.b;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.n.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        getOnBackPressedDispatcher().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((nl) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.h.a(bundle);
        rl rlVar = this.e;
        rlVar.getClass();
        rlVar.b = this;
        Iterator it = rlVar.a.iterator();
        while (it.hasNext()) {
            ((xj) it.next()).a();
        }
        e(bundle);
        int i = si0.d;
        qi0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f.d).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f.d).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.t = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.t = false;
            Iterator it = this.r.iterator();
            while (it.hasNext()) {
                nl nlVar = (nl) it.next();
                configuration.getClass();
                nlVar.accept(new ts(21));
            }
        } catch (Throwable th) {
            this.t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((nl) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f.d).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.u = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.u = false;
            Iterator it = this.s.iterator();
            while (it.hasNext()) {
                nl nlVar = (nl) it.next();
                configuration.getClass();
                nlVar.accept(new ts(22));
            }
        } catch (Throwable th) {
            this.u = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f.d).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.n.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        bk bkVar;
        t60 t60Var = this.i;
        if (t60Var == null && (bkVar = (bk) getLastNonConfigurationInstance()) != null) {
            t60Var = bkVar.a;
        }
        if (t60Var == null) {
            return null;
        }
        bk bkVar2 = new bk();
        bkVar2.a = t60Var;
        return bkVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        a50 a50Var = this.g;
        if (a50Var != null) {
            a50Var.d("setCurrentState");
            a50Var.f(r40.f);
        }
        f(bundle);
        this.h.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((nl) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (fw0.a()) {
                cq.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            hy hyVar = this.l;
            synchronized (hyVar.b) {
                try {
                    hyVar.a = true;
                    ArrayList arrayList = (ArrayList) hyVar.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((iy) obj).invoke();
                    }
                    ((ArrayList) hyVar.c).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        d();
        this.k.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        d();
        this.k.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        this.k.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.t) {
            return;
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((nl) it.next()).accept(new ts(21));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.u) {
            return;
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((nl) it.next()).accept(new ts(22));
        }
    }
}
