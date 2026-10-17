package androidx.compose.foundation.text.selection;

import android.os.Build;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.lb0;
import defpackage.my;
import defpackage.o;
import defpackage.ob0;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 159}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-text-TextRange$-selection$0, reason: not valid java name */
    final /* synthetic */ long f59$$v$c$androidxcomposeuitextTextRange$selection$0;
    final /* synthetic */ CharSequence $text;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PlatformSelectionBehaviorsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(CharSequence charSequence, long j, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, hm hmVar) {
        super(2, hmVar);
        this.$text = charSequence;
        this.f59$$v$c$androidxcomposeuitextTextRange$selection$0 = j;
        this.this$0 = platformSelectionBehaviorsImpl;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 = new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(this.$text, this.f59$$v$c$androidxcomposeuitextTextRange$selection$0, this.this$0, hmVar);
        platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2.L$0 = obj;
        return platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;
    }

    @Override // defpackage.my
    public final Object invoke(TextClassifier textClassifier, hm hmVar) {
        return ((PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2) create(textClassifier, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        LocaleList androidLocalList;
        long TextRange;
        Object m1494classifyTextM8tDOmk;
        long j;
        TextClassification textClassification;
        lb0 lb0Var;
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl;
        CharSequence charSequence;
        Object obj2;
        TextSelection textSelection;
        TextClassification textClassification2;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(this.$text, TextRange.m7058getMinimpl(this.f59$$v$c$androidxcomposeuitextTextRange$selection$0), TextRange.m7057getMaximpl(this.f59$$v$c$androidxcomposeuitextTextRange$selection$0));
            androidLocalList = this.this$0.getAndroidLocalList();
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(androidLocalList);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection suggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            TextRange = TextRangeKt.TextRange(suggestSelection.getSelectionStartIndex(), suggestSelection.getSelectionEndIndex());
            vn vnVar = vn.d;
            if (i2 >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    lb0Var = this.this$0.mutex;
                    platformSelectionBehaviorsImpl = this.this$0;
                    CharSequence charSequence2 = this.$text;
                    this.L$0 = suggestSelection;
                    this.L$1 = lb0Var;
                    this.L$2 = platformSelectionBehaviorsImpl;
                    this.L$3 = charSequence2;
                    this.J$0 = TextRange;
                    this.label = 1;
                    ob0 ob0Var = (ob0) lb0Var;
                    if (ob0Var.d(this) != vnVar) {
                        charSequence = charSequence2;
                        obj2 = ob0Var;
                        textSelection = suggestSelection;
                        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl2 = platformSelectionBehaviorsImpl;
                        textClassification2 = textSelection.getTextClassification();
                        textClassification2.getClass();
                        platformSelectionBehaviorsImpl2.setTextClassificationResult(new TextClassificationResult(charSequence, TextRange, textClassification2, null));
                    }
                    return vnVar;
                }
            }
            PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl3 = this.this$0;
            CharSequence charSequence3 = this.$text;
            this.J$0 = TextRange;
            this.label = 2;
            m1494classifyTextM8tDOmk = platformSelectionBehaviorsImpl3.m1494classifyTextM8tDOmk(charSequence3, TextRange, textClassifier, this);
            if (m1494classifyTextM8tDOmk != vnVar) {
                j = TextRange;
                TextRange = j;
            }
            return vnVar;
        }
        if (i == 1) {
            long j2 = this.J$0;
            CharSequence charSequence4 = (CharSequence) this.L$3;
            platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.L$2;
            Object obj3 = (lb0) this.L$1;
            textSelection = (TextSelection) this.L$0;
            p10.Q(obj);
            TextRange = j2;
            obj2 = obj3;
            charSequence = charSequence4;
            PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl22 = platformSelectionBehaviorsImpl;
            try {
                textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                platformSelectionBehaviorsImpl22.setTextClassificationResult(new TextClassificationResult(charSequence, TextRange, textClassification2, null));
            } finally {
                ((ob0) obj2).f(null);
            }
        } else {
            if (i != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            p10.Q(obj);
            TextRange = j;
        }
        return TextRange.m7048boximpl(TextRange);
    }
}
