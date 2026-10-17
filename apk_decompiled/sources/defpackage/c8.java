package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.KeyEvent;
import com.lumi.singularity.R;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class c8 {
    public static volatile c8 d;
    public static final Object e = new Object();
    public final Object a;
    public Object b;
    public final Object c;

    public c8(f90 f90Var, ts tsVar, gq gqVar, Set set) {
        this.a = tsVar;
        this.b = f90Var;
        this.c = gqVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            j(str, 0, str.length(), 1, true, new ox(str, 3));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        s01[] s01VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (s01VarArr = (s01[]) editable.getSpans(selectionStart, selectionEnd, s01.class)) != null && s01VarArr.length > 0) {
                for (s01 s01Var : s01VarArr) {
                    int spanStart = editable.getSpanStart(s01Var);
                    int spanEnd = editable.getSpanEnd(s01Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static c8 f(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new c8(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g(ht htVar, Editable editable, int i, int i2, boolean z) {
        int min;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i2, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i2, editable.length());
                }
                s01[] s01VarArr = (s01[]) editable.getSpans(selectionStart, min, s01.class);
                if (s01VarArr != null && s01VarArr.length > 0) {
                    for (s01 s01Var : s01VarArr) {
                        int spanStart = editable.getSpanStart(s01Var);
                        int spanEnd = editable.getSpanEnd(s01Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    htVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    htVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public void b(Bundle bundle) {
        HashSet hashSet = (HashSet) this.b;
        String string = ((Context) this.c).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (r00.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    c((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new tj(e2);
            }
        }
    }

    public Object c(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.a;
        if (fw0.a()) {
            try {
                cq.c(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                r00 r00Var = (r00) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = r00Var.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            c(cls2, hashSet);
                        }
                    }
                }
                obj = r00Var.b((Context) this.c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new tj(th);
            }
        }
        return obj;
    }

    public Drawable d(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : aj0.c().d((Context) this.c, resourceId);
    }

    public Typeface e(int i, int i2, q7 q7Var) {
        int resourceId = ((TypedArray) this.a).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = (TypedValue) this.b;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.b = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        Context context = (Context) this.c;
        ThreadLocal threadLocal = fj0.a;
        if (context.isRestricted()) {
            return null;
        }
        return fj0.a(context, resourceId, typedValue2, i2, q7Var, true);
    }

    public boolean h(CharSequence charSequence, int i, int i2, r01 r01Var) {
        if ((r01Var.c & 3) == 0) {
            gq gqVar = (gq) this.c;
            c90 b = r01Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.g).getShort(a + b.d);
            }
            gqVar.getClass();
            ThreadLocal threadLocal = gq.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = gqVar.a;
            String sb2 = sb.toString();
            int i3 = we0.a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i4 = r01Var.c & 4;
            r01Var.c = hasGlyph ? i4 | 2 : i4 | 1;
        }
        return (r01Var.c & 3) == 2;
    }

    public void i(Activity activity, t31 t31Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.c;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            if (t31Var.equals((t31) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((wp0) ((p7) this.a).d).b.iterator();
            it.getClass();
            while (it.hasNext()) {
                vp0 vp0Var = (vp0) it.next();
                if (vp0Var.a.equals(activity)) {
                    vp0Var.c = t31Var;
                    vp0Var.b.accept(t31Var);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public Object j(CharSequence charSequence, int i, int i2, int i3, boolean z, kt ktVar) {
        int i4;
        char c;
        mt mtVar = new mt((e90) ((f90) this.b).c);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                e90 e90Var = (e90) mtVar.c.a.get(codePointAt);
                if (mtVar.a == 2) {
                    if (e90Var != null) {
                        mtVar.c = e90Var;
                        mtVar.f++;
                    } else {
                        if (codePointAt == 65038) {
                            mtVar.a();
                        } else if (codePointAt != 65039) {
                            e90 e90Var2 = mtVar.c;
                            if (e90Var2.b != null) {
                                if (mtVar.f != 1) {
                                    mtVar.d = e90Var2;
                                    mtVar.a();
                                } else if (mtVar.b()) {
                                    mtVar.d = mtVar.c;
                                    mtVar.a();
                                } else {
                                    mtVar.a();
                                }
                                c = 3;
                            } else {
                                mtVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (e90Var == null) {
                    mtVar.a();
                    c = 1;
                } else {
                    mtVar.a = 2;
                    mtVar.c = e90Var;
                    mtVar.f = 1;
                    c = 2;
                }
                mtVar.e = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !h(charSequence, i4, i6, mtVar.d.b)) {
                        z2 = ktVar.b(charSequence, i4, i6, mtVar.d.b);
                        i5++;
                    }
                }
            }
        }
        if (mtVar.a == 2 && mtVar.c.b != null && ((mtVar.f > 1 || mtVar.b()) && i5 < i3 && z2 && (z || !h(charSequence, i4, i6, mtVar.c.b)))) {
            ktVar.b(charSequence, i4, i6, mtVar.c.b);
        }
        return ktVar.a();
    }

    public void k() {
        ((TypedArray) this.a).recycle();
    }

    public c8(Context context, TypedArray typedArray) {
        this.c = context;
        this.a = typedArray;
    }

    public c8(Context context) {
        this.c = context.getApplicationContext();
        this.b = new HashSet();
        this.a = new HashMap();
    }

    public c8(Method method, Method method2, Method method3) {
        this.a = method;
        this.b = method2;
        this.c = method3;
    }

    public c8(p7 p7Var) {
        this.a = p7Var;
        this.b = new ReentrantLock();
        this.c = new WeakHashMap();
    }
}
