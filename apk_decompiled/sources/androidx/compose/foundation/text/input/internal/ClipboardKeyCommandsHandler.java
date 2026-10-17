package androidx.compose.foundation.text.input.internal;

import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClipboardKeyCommandsHandler {
    private final ky handler;

    private /* synthetic */ ClipboardKeyCommandsHandler(ky kyVar) {
        this.handler = kyVar;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipboardKeyCommandsHandler m1270boximpl(ky kyVar) {
        return new ClipboardKeyCommandsHandler(kyVar);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1272equalsimpl(ky kyVar, Object obj) {
        return (obj instanceof ClipboardKeyCommandsHandler) && q10.b(kyVar, ((ClipboardKeyCommandsHandler) obj).m1276unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1273equalsimpl0(ky kyVar, ky kyVar2) {
        return q10.b(kyVar, kyVar2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1274hashCodeimpl(ky kyVar) {
        return kyVar.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1275toStringimpl(ky kyVar) {
        return "ClipboardKeyCommandsHandler(handler=" + kyVar + ')';
    }

    public boolean equals(Object obj) {
        return m1272equalsimpl(this.handler, obj);
    }

    public final ky getHandler() {
        return this.handler;
    }

    public int hashCode() {
        return m1274hashCodeimpl(this.handler);
    }

    public String toString() {
        return m1275toStringimpl(this.handler);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ ky m1276unboximpl() {
        return this.handler;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static ky m1271constructorimpl(ky kyVar) {
        return kyVar;
    }
}
