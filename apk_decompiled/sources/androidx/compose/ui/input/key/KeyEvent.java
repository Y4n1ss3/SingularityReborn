package androidx.compose.ui.input.key;

import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class KeyEvent {
    private final android.view.KeyEvent nativeKeyEvent;

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEvent m5915boximpl(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5917equalsimpl(android.view.KeyEvent keyEvent, Object obj) {
        return (obj instanceof KeyEvent) && q10.b(keyEvent, ((KeyEvent) obj).m5921unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5918equalsimpl0(android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2) {
        return q10.b(keyEvent, keyEvent2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5919hashCodeimpl(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5920toStringimpl(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m5917equalsimpl(this.nativeKeyEvent, obj);
    }

    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public int hashCode() {
        return m5919hashCodeimpl(this.nativeKeyEvent);
    }

    public String toString() {
        return m5920toStringimpl(this.nativeKeyEvent);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ android.view.KeyEvent m5921unboximpl() {
        return this.nativeKeyEvent;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static android.view.KeyEvent m5916constructorimpl(android.view.KeyEvent keyEvent) {
        return keyEvent;
    }
}
