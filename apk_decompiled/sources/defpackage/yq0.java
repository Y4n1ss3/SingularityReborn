package defpackage;

import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.TextRangeLayoutMeasureResult;
import androidx.compose.foundation.text.TextRangeLayoutMeasureScope;
import androidx.compose.foundation.text.TextRangeScopeMeasurePolicy;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditorKt;
import androidx.compose.ui.text.AnnotatedString;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class yq0 implements SlotTableEditor.VisitSlotsInRememberOrderCallback, TextRangeScopeMeasurePolicy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yq0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.compose.foundation.text.TextRangeScopeMeasurePolicy
    public TextRangeLayoutMeasureResult measure(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        TextRangeLayoutMeasureResult textRange$lambda$0;
        textRange$lambda$0 = TextLinkScope.textRange$lambda$0((TextLinkScope) this.a, (AnnotatedString.Range) this.b, textRangeLayoutMeasureScope);
        return textRange$lambda$0;
    }

    @Override // androidx.compose.runtime.composer.linkbuffer.SlotTableEditor.VisitSlotsInRememberOrderCallback
    public boolean visit(int i, int i2, Object obj) {
        boolean deactivateGroup$lambda$0;
        deactivateGroup$lambda$0 = SlotTableEditorKt.deactivateGroup$lambda$0((SlotTableEditor) this.a, (RememberManager) this.b, i, i2, obj);
        return deactivateGroup$lambda$0;
    }
}
