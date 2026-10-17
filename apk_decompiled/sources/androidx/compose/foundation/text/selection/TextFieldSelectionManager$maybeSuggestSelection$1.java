package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.q10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", l = {567}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager$maybeSuggestSelection$1 extends us0 implements my {
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ PlatformSelectionBehaviors $platformSelectionBehaviors;
    final /* synthetic */ TextRange $selection;
    final /* synthetic */ String $text;
    final /* synthetic */ long $transformedSelection;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$maybeSuggestSelection$1(PlatformSelectionBehaviors platformSelectionBehaviors, String str, long j, TextRange textRange, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping, hm hmVar) {
        super(2, hmVar);
        this.$platformSelectionBehaviors = platformSelectionBehaviors;
        this.$text = str;
        this.$transformedSelection = j;
        this.$selection = textRange;
        this.this$0 = textFieldSelectionManager;
        this.$offsetMapping = offsetMapping;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldSelectionManager$maybeSuggestSelection$1(this.$platformSelectionBehaviors, this.$text, this.$transformedSelection, this.$selection, this.this$0, this.$offsetMapping, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldSelectionManager$maybeSuggestSelection$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        TextFieldValue m1552createTextFieldValueFDrldGo;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            PlatformSelectionBehaviors platformSelectionBehaviors = this.$platformSelectionBehaviors;
            String str = this.$text;
            long j = this.$transformedSelection;
            this.label = 1;
            obj = platformSelectionBehaviors.mo1491suggestSelectionForLongPressOrDoubleClickpYaCww(str, j, this);
            vn vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        TextRange textRange = (TextRange) obj;
        w01 w01Var = w01.a;
        if (textRange != null) {
            OffsetMapping offsetMapping = this.$offsetMapping;
            long m7064unboximpl = textRange.m7064unboximpl();
            long TextRange = TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextRange.m7060getStartimpl(m7064unboximpl)), offsetMapping.transformedToOriginal(TextRange.m7055getEndimpl(m7064unboximpl)));
            if (!TextRange.m7052equalsimpl(TextRange, this.$selection) && q10.b(this.this$0.getValue$foundation().getText(), this.$text) && this.$offsetMapping == this.this$0.getOffsetMapping$foundation()) {
                ky onValueChange$foundation = this.this$0.getOnValueChange$foundation();
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                m1552createTextFieldValueFDrldGo = textFieldSelectionManager.m1552createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation().getAnnotatedString(), TextRange);
                onValueChange$foundation.invoke(m1552createTextFieldValueFDrldGo);
                this.this$0.m1564setLatestSelectionOEnZFl4$foundation(TextRange.m7048boximpl(TextRange));
            }
        }
        return w01Var;
    }
}
