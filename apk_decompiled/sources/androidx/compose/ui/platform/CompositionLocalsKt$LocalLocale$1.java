package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.text.intl.Locale;
import defpackage.f30;
import defpackage.ky;
import defpackage.yi;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class CompositionLocalsKt$LocalLocale$1 extends f30 implements ky {
    public static final CompositionLocalsKt$LocalLocale$1 INSTANCE = new CompositionLocalsKt$LocalLocale$1();

    public CompositionLocalsKt$LocalLocale$1() {
        super(1);
    }

    @Override // defpackage.ky
    public final Locale invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        Object next;
        Iterable iterable = (Iterable) compositionLocalAccessorScope.getCurrentValue(CompositionLocalsKt.getLocalLocaleList());
        iterable.getClass();
        if (iterable instanceof List) {
            next = yi.p0((List) iterable);
        } else {
            Iterator it = iterable.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException("Collection is empty.");
            }
            next = it.next();
        }
        return (Locale) next;
    }
}
