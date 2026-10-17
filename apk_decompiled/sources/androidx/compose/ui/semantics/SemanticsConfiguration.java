package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.JvmActuals_jvmKt;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.iy;
import defpackage.kp0;
import defpackage.n20;
import defpackage.o80;
import defpackage.q10;
import defpackage.ql0;
import defpackage.rl0;
import defpackage.sl0;
import defpackage.ty;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, n20 {
    public static final int $stable = 8;
    private gb0 _accessibilityExtraKeys;
    private boolean isClearingSemantics;
    private boolean isMergingSemanticsOfDescendants;
    private Map<SemanticsPropertyKey<?>, ? extends Object> mapWrapper;
    private final fb0 props;

    public SemanticsConfiguration() {
        long[] jArr = ql0.a;
        this.props = new fb0();
    }

    public final void collapsePeer$ui(SemanticsConfiguration semanticsConfiguration) {
        int i;
        if (semanticsConfiguration.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (semanticsConfiguration.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        fb0 fb0Var = semanticsConfiguration.props;
        Object[] objArr = fb0Var.b;
        Object[] objArr2 = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        Object obj2 = objArr2[i6];
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        if (!this.props.a(semanticsPropertyKey)) {
                            this.props.l(semanticsPropertyKey, obj2);
                        } else if (obj2 instanceof AccessibilityAction) {
                            Object d = this.props.d(semanticsPropertyKey);
                            d.getClass();
                            AccessibilityAction accessibilityAction = (AccessibilityAction) d;
                            fb0 fb0Var2 = this.props;
                            String label = accessibilityAction.getLabel();
                            if (label == null) {
                                label = ((AccessibilityAction) obj2).getLabel();
                            }
                            i = i3;
                            String str = label;
                            ty action = accessibilityAction.getAction();
                            if (action == null) {
                                action = ((AccessibilityAction) obj2).getAction();
                            }
                            fb0Var2.l(semanticsPropertyKey, new AccessibilityAction(str, action));
                            j >>= i;
                            i5++;
                            i3 = i;
                        }
                    }
                    i = i3;
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final <T> boolean contains(SemanticsPropertyKey<T> semanticsPropertyKey) {
        return this.props.b(semanticsPropertyKey);
    }

    public final boolean containsImportantForAccessibility$ui() {
        fb0 fb0Var = this.props;
        Object[] objArr = fb0Var.b;
        Object[] objArr2 = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            if (((SemanticsPropertyKey) obj).isImportantForAccessibility$ui()) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final SemanticsConfiguration copy() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        fb0 fb0Var = semanticsConfiguration.props;
        fb0 fb0Var2 = this.props;
        fb0Var.getClass();
        fb0Var2.getClass();
        Object[] objArr = fb0Var2.b;
        Object[] objArr2 = fb0Var2.c;
        long[] jArr = fb0Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            fb0Var.l(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return semanticsConfiguration;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return q10.b(this.props, semanticsConfiguration.props) && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics;
    }

    public final <T> T get(SemanticsPropertyKey<T> semanticsPropertyKey) {
        T t = (T) this.props.d(semanticsPropertyKey);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    public final rl0 getAccessibilityExtraKeys$ui() {
        return this._accessibilityExtraKeys;
    }

    public final <T> T getOrElse(SemanticsPropertyKey<T> semanticsPropertyKey, iy iyVar) {
        T t = (T) this.props.d(semanticsPropertyKey);
        return t == null ? (T) iyVar.invoke() : t;
    }

    public final <T> T getOrElseNullable(SemanticsPropertyKey<T> semanticsPropertyKey, iy iyVar) {
        T t = (T) this.props.d(semanticsPropertyKey);
        return t == null ? (T) iyVar.invoke() : t;
    }

    public final fb0 getProps$ui() {
        return this.props;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isClearingSemantics) + kp0.c(this.props.hashCode() * 31, 31, this.isMergingSemanticsOfDescendants);
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        Map<SemanticsPropertyKey<?>, ? extends Object> map = this.mapWrapper;
        if (map == null) {
            fb0 fb0Var = this.props;
            fb0Var.getClass();
            o80 o80Var = new o80(fb0Var);
            this.mapWrapper = o80Var;
            map = o80Var;
        }
        return map.entrySet().iterator();
    }

    public final void mergeChild$ui(SemanticsConfiguration semanticsConfiguration) {
        fb0 fb0Var = semanticsConfiguration.props;
        Object[] objArr = fb0Var.b;
        Object[] objArr2 = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        Object d = this.props.d(semanticsPropertyKey);
                        semanticsPropertyKey.getClass();
                        Object merge = semanticsPropertyKey.merge(d, obj2);
                        if (merge != null) {
                            this.props.l(semanticsPropertyKey, merge);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public <T> void set(SemanticsPropertyKey<T> semanticsPropertyKey, T t) {
        if ((t instanceof AccessibilityAction) && contains(semanticsPropertyKey)) {
            Object d = this.props.d(semanticsPropertyKey);
            d.getClass();
            AccessibilityAction accessibilityAction = (AccessibilityAction) d;
            fb0 fb0Var = this.props;
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) t;
            String label = accessibilityAction2.getLabel();
            if (label == null) {
                label = accessibilityAction.getLabel();
            }
            ty action = accessibilityAction2.getAction();
            if (action == null) {
                action = accessibilityAction.getAction();
            }
            fb0Var.l(semanticsPropertyKey, new AccessibilityAction(label, action));
        } else {
            this.props.l(semanticsPropertyKey, t);
        }
        if (semanticsPropertyKey.getAccessibilityExtraKey$ui() != null) {
            gb0 gb0Var = this._accessibilityExtraKeys;
            if (gb0Var == null) {
                gb0 gb0Var2 = sl0.a;
                gb0Var = new gb0();
                this._accessibilityExtraKeys = gb0Var;
            }
            gb0Var.d(semanticsPropertyKey);
        }
    }

    public final void setClearingSemantics(boolean z) {
        this.isClearingSemantics = z;
    }

    public final void setMergingSemanticsOfDescendants(boolean z) {
        this.isMergingSemanticsOfDescendants = z;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.isMergingSemanticsOfDescendants) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.isClearingSemantics) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        fb0 fb0Var = this.props;
        Object[] objArr = fb0Var.b;
        Object[] objArr2 = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((SemanticsPropertyKey) obj).getName());
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + "{ " + ((Object) sb) + " }";
    }
}
