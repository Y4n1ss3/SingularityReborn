package androidx.compose.ui.autofill;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import defpackage.dq;
import defpackage.er;
import defpackage.ky;
import defpackage.q10;
import defpackage.ut;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public final class AutofillNode {
    public static final int $stable = 8;
    private final List<AutofillType> autofillTypes;
    private Rect boundingBox;
    private final int id;
    private final ky onFill;

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(List<? extends AutofillType> list, Rect rect, ky kyVar) {
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = kyVar;
        this.id = SemanticsModifierKt.generateSemanticsId();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        return q10.b(this.autofillTypes, autofillNode.autofillTypes) && q10.b(this.boundingBox, autofillNode.boundingBox) && this.onFill == autofillNode.onFill;
    }

    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.id;
    }

    public final ky getOnFill() {
        return this.onFill;
    }

    public int hashCode() {
        int hashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int hashCode2 = (hashCode + (rect != null ? rect.hashCode() : 0)) * 31;
        ky kyVar = this.onFill;
        return hashCode2 + (kyVar != null ? kyVar.hashCode() : 0);
    }

    public final void setBoundingBox(Rect rect) {
        this.boundingBox = rect;
    }

    public /* synthetic */ AutofillNode(List list, Rect rect, ky kyVar, int i, dq dqVar) {
        this((i & 1) != 0 ? ut.d : list, (i & 2) != 0 ? null : rect, kyVar);
    }
}
