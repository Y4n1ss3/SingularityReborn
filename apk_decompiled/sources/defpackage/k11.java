package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class k11 {
    public final yb a;
    public final yb b;
    public final yb c;

    public k11(yb ybVar, yb ybVar2, yb ybVar3) {
        this.a = ybVar;
        this.b = ybVar2;
        this.c = ybVar3;
    }

    public abstract l11 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        yb ybVar = this.c;
        Class cls2 = (Class) ybVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        ybVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        yb ybVar = this.a;
        Method method = (Method) ybVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, k11.class.getClassLoader()).getDeclaredMethod("read", k11.class);
        ybVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        yb ybVar = this.b;
        Method method = (Method) ybVar.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, k11.class);
        ybVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((l11) this).e.readParcelable(l11.class.getClassLoader());
    }

    public final m11 g() {
        String readString = ((l11) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (m11) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(m11 m11Var) {
        if (m11Var == null) {
            ((l11) this).e.writeString(null);
            return;
        }
        try {
            ((l11) this).e.writeString(b(m11Var.getClass()).getName());
            l11 a = a();
            try {
                d(m11Var.getClass()).invoke(null, m11Var, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(m11Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
