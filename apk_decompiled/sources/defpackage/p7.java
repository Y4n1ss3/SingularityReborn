package defpackage;

import android.R;
import android.content.Context;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class p7 implements zs, ig0, o21 {
    public Object d;

    public p7(int i, boolean z) {
        switch (i) {
            case 7:
                this.d = new CopyOnWriteArrayList();
                new HashMap();
                break;
            default:
                this.d = new AtomicReference(null);
                break;
        }
    }

    @Override // defpackage.zs
    public void a(final p10 p10Var) {
        il ilVar = new il("EmojiCompatInitializer");
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), ilVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: ct
            @Override // java.lang.Runnable
            public final void run() {
                p7 p7Var = p7.this;
                p10 p10Var2 = p10Var;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    ux l = q10.l((Context) p7Var.d);
                    if (l == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    tx txVar = (tx) l.a;
                    synchronized (txVar.f) {
                        txVar.h = threadPoolExecutor2;
                    }
                    l.a.a(new dt(p10Var2, threadPoolExecutor2));
                } catch (Throwable th) {
                    p10Var2.z(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    public void b(Object obj) {
        ((ArrayList) this.d).add(obj);
    }

    @Override // defpackage.ig0
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.ig0
    public void d(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.d).setResultCode(i);
    }

    public void e(Object obj) {
        ArrayList arrayList = (ArrayList) this.d;
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public KeyListener f(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        if (keyListener instanceof jt) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new jt(keyListener);
    }

    public void g() {
        View view = (View) this.d;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void h(boolean z) {
        ot otVar = (ot) ((bg) ((p7) this.d).d).b;
        if (otVar.c != z) {
            if (otVar.b != null) {
                at a = at.a();
                nt ntVar = otVar.b;
                a.getClass();
                d41.e(ntVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(ntVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            otVar.c = z;
            if (z) {
                ot.a(otVar.a, at.a().c());
            }
        }
    }

    public void i() {
        View view;
        View view2 = (View) this.d;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new j(view, 10));
    }

    public p7(int i) {
        this.d = new ArrayList(i);
    }

    public /* synthetic */ p7(Object obj) {
        this.d = obj;
    }

    public p7(l7 l7Var, int i) {
        switch (i) {
            case 4:
                this.d = new bg(l7Var);
                break;
            default:
                this.d = new p7(l7Var, 4);
                break;
        }
    }

    public p7(SideSheetBehavior sideSheetBehavior) {
        this.d = sideSheetBehavior;
        new j(this, 9);
    }

    public p7(BottomSheetBehavior bottomSheetBehavior) {
        this.d = bottomSheetBehavior;
        new xe(this, 0);
    }
}
