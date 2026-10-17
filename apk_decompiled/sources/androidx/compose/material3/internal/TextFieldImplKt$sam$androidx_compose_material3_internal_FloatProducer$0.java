package androidx.compose.material3.internal;

import defpackage.iy;
import defpackage.q10;
import defpackage.ty;
import defpackage.uy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 implements FloatProducer, uy {
    private final /* synthetic */ iy function;

    public TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(iy iyVar) {
        this.function = iyVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FloatProducer) && (obj instanceof uy)) {
            return q10.b(getFunctionDelegate(), ((uy) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.uy
    public final ty getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.material3.internal.FloatProducer
    public final /* synthetic */ float invoke() {
        return ((Number) this.function.invoke()).floatValue();
    }
}
