package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.p01;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Actual_jvmAndAndroidKt {
    public static final boolean areObjectsOfSameType(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final Object classKeyForObject(Object obj) {
        return obj.getClass();
    }

    public static final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static final void tryPopulateReflectively(InspectorInfo inspectorInfo, ModifierNodeElement<?> modifierNodeElement) {
        Object[] declaredFields = modifierNodeElement.getClass().getDeclaredFields();
        Comparator comparator = new Comparator() { // from class: androidx.compose.ui.Actual_jvmAndAndroidKt$tryPopulateReflectively$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return p01.i(((Field) t).getName(), ((Field) t2).getName());
            }
        };
        declaredFields.getClass();
        if (declaredFields.length != 0) {
            declaredFields = Arrays.copyOf(declaredFields, declaredFields.length);
            if (declaredFields.length > 1) {
                Arrays.sort(declaredFields, comparator);
            }
        }
        List asList = Arrays.asList(declaredFields);
        asList.getClass();
        int size = asList.size();
        for (int i = 0; i < size; i++) {
            Field field = (Field) asList.get(i);
            if (!field.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field.setAccessible(true);
                    inspectorInfo.getProperties().set(field.getName(), field.get(modifierNodeElement));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
