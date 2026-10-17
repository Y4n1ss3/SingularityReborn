package androidx.compose.foundation.text.selection;

import android.app.RemoteAction;
import android.content.Context;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import defpackage.hm;
import defpackage.kn;
import defpackage.ky;
import defpackage.lb0;
import defpackage.my;
import defpackage.o;
import defpackage.ob0;
import defpackage.p01;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlatformSelectionBehaviorsImpl implements PlatformSelectionBehaviors {
    public static final int $stable = 8;
    private final Context context;
    private final kn coroutineContext;
    private final LocaleList localeList;
    private final SelectedTextType selectedTextType;
    private TextClassifier textClassificationSession;
    private final lb0 mutex = new ob0();
    private final MutableState textClassificationResult$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final Object AssistantItemKey = new Object();

    public PlatformSelectionBehaviorsImpl(kn knVar, Context context, SelectedTextType selectedTextType, LocaleList localeList) {
        this.coroutineContext = knVar;
        this.context = context;
        this.selectedTextType = selectedTextType;
        this.localeList = localeList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #1 {all -> 0x0093, blocks: (B:24:0x0081, B:26:0x0087), top: B:23:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: classifyText-M8tDOmk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1494classifyTextM8tDOmk(CharSequence charSequence, long j, TextClassifier textClassifier, hm hmVar) {
        PlatformSelectionBehaviorsImpl$classifyText$1 platformSelectionBehaviorsImpl$classifyText$1;
        int i;
        vn vnVar;
        TextClassifier textClassifier2;
        long j2;
        CharSequence charSequence2;
        lb0 lb0Var;
        TextClassificationResult textClassificationResult;
        ob0 ob0Var;
        TextClassification textClassification;
        long j3;
        CharSequence charSequence3;
        boolean m1500canReuseh5sm0ck;
        Object obj;
        try {
            if (hmVar instanceof PlatformSelectionBehaviorsImpl$classifyText$1) {
                platformSelectionBehaviorsImpl$classifyText$1 = (PlatformSelectionBehaviorsImpl$classifyText$1) hmVar;
                int i2 = platformSelectionBehaviorsImpl$classifyText$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    platformSelectionBehaviorsImpl$classifyText$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = platformSelectionBehaviorsImpl$classifyText$1.result;
                    i = platformSelectionBehaviorsImpl$classifyText$1.label;
                    w01 w01Var = w01.a;
                    vnVar = vn.d;
                    if (i != 0) {
                        p10.Q(obj2);
                        lb0 lb0Var2 = this.mutex;
                        platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence;
                        textClassifier2 = textClassifier;
                        platformSelectionBehaviorsImpl$classifyText$1.L$1 = textClassifier2;
                        platformSelectionBehaviorsImpl$classifyText$1.L$2 = lb0Var2;
                        j2 = j;
                        platformSelectionBehaviorsImpl$classifyText$1.J$0 = j2;
                        platformSelectionBehaviorsImpl$classifyText$1.label = 1;
                        ob0 ob0Var2 = (ob0) lb0Var2;
                        if (ob0Var2.d(platformSelectionBehaviorsImpl$classifyText$1) != vnVar) {
                            charSequence2 = charSequence;
                            lb0Var = ob0Var2;
                        }
                        return vnVar;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        long j4 = platformSelectionBehaviorsImpl$classifyText$1.J$0;
                        Object obj3 = (lb0) platformSelectionBehaviorsImpl$classifyText$1.L$2;
                        TextClassification textClassification2 = (TextClassification) platformSelectionBehaviorsImpl$classifyText$1.L$1;
                        CharSequence charSequence4 = (CharSequence) platformSelectionBehaviorsImpl$classifyText$1.L$0;
                        p10.Q(obj2);
                        charSequence3 = charSequence4;
                        j3 = j4;
                        textClassification = textClassification2;
                        obj = obj3;
                        try {
                            setTextClassificationResult(new TextClassificationResult(charSequence3, j3, textClassification, null));
                            return w01Var;
                        } finally {
                        }
                    }
                    long j5 = platformSelectionBehaviorsImpl$classifyText$1.J$0;
                    lb0Var = (lb0) platformSelectionBehaviorsImpl$classifyText$1.L$2;
                    TextClassifier textClassifier3 = (TextClassifier) platformSelectionBehaviorsImpl$classifyText$1.L$1;
                    charSequence2 = (CharSequence) platformSelectionBehaviorsImpl$classifyText$1.L$0;
                    p10.Q(obj2);
                    textClassifier2 = textClassifier3;
                    j2 = j5;
                    textClassificationResult = getTextClassificationResult();
                    if (textClassificationResult != null) {
                        m1500canReuseh5sm0ck = PlatformSelectionBehaviors_androidKt.m1500canReuseh5sm0ck(textClassificationResult, charSequence2, j2);
                        if (m1500canReuseh5sm0ck) {
                            return w01Var;
                        }
                    }
                    ((ob0) lb0Var).f(null);
                    TextClassification classifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, TextRange.m7058getMinimpl(j2), TextRange.m7057getMaximpl(j2)).setDefaultLocales(getAndroidLocalList()).build());
                    lb0 lb0Var3 = this.mutex;
                    platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence2;
                    platformSelectionBehaviorsImpl$classifyText$1.L$1 = classifyText;
                    platformSelectionBehaviorsImpl$classifyText$1.L$2 = lb0Var3;
                    platformSelectionBehaviorsImpl$classifyText$1.J$0 = j2;
                    platformSelectionBehaviorsImpl$classifyText$1.label = 2;
                    ob0Var = (ob0) lb0Var3;
                    if (ob0Var.d(platformSelectionBehaviorsImpl$classifyText$1) != vnVar) {
                        textClassification = classifyText;
                        j3 = j2;
                        charSequence3 = charSequence2;
                        obj = ob0Var;
                        setTextClassificationResult(new TextClassificationResult(charSequence3, j3, textClassification, null));
                        return w01Var;
                    }
                    return vnVar;
                }
            }
            textClassificationResult = getTextClassificationResult();
            if (textClassificationResult != null) {
            }
            ((ob0) lb0Var).f(null);
            TextClassification classifyText2 = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, TextRange.m7058getMinimpl(j2), TextRange.m7057getMaximpl(j2)).setDefaultLocales(getAndroidLocalList()).build());
            lb0 lb0Var32 = this.mutex;
            platformSelectionBehaviorsImpl$classifyText$1.L$0 = charSequence2;
            platformSelectionBehaviorsImpl$classifyText$1.L$1 = classifyText2;
            platformSelectionBehaviorsImpl$classifyText$1.L$2 = lb0Var32;
            platformSelectionBehaviorsImpl$classifyText$1.J$0 = j2;
            platformSelectionBehaviorsImpl$classifyText$1.label = 2;
            ob0Var = (ob0) lb0Var32;
            if (ob0Var.d(platformSelectionBehaviorsImpl$classifyText$1) != vnVar) {
            }
            return vnVar;
        } finally {
        }
        platformSelectionBehaviorsImpl$classifyText$1 = new PlatformSelectionBehaviorsImpl$classifyText$1(this, hmVar);
        Object obj22 = platformSelectionBehaviorsImpl$classifyText$1.result;
        i = platformSelectionBehaviorsImpl$classifyText$1.label;
        w01 w01Var2 = w01.a;
        vnVar = vn.d;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.os.LocaleList getAndroidLocalList() {
        android.os.LocaleList androidLocaleList;
        LocaleList localeList = this.localeList;
        return (localeList == null || (androidLocaleList = TextClassifierHelperMethods.INSTANCE.toAndroidLocaleList(localeList)) == null) ? new android.os.LocaleList(Locale.Companion.getCurrent().getPlatformLocale()) : androidLocaleList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TextClassificationResult getTextClassificationResult() {
        return (TextClassificationResult) this.textClassificationResult$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onShowContextMenuOrSelectionToolbar-Sb-Bc2M, reason: not valid java name */
    public final Object m1495onShowContextMenuOrSelectionToolbarSbBc2M(CharSequence charSequence, long j, hm hmVar) {
        return (charSequence.length() == 0 || TextRange.m7054getCollapsedimpl(j)) ? w01.a : requireTextClassificationSession(new PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(this, charSequence, j, null), hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object requireTextClassificationSession(my myVar, hm hmVar) {
        return p01.H(this.coroutineContext, new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this, myVar, null), hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextClassificationResult(TextClassificationResult textClassificationResult) {
        this.textClassificationResult$delegate.setValue(textClassificationResult);
    }

    /* renamed from: addSmartSelectionTextContextMenuItems-YmzfRxQ$foundation, reason: not valid java name */
    public final void m1496addSmartSelectionTextContextMenuItemsYmzfRxQ$foundation(TextContextMenuBuilderScope textContextMenuBuilderScope, CharSequence charSequence, long j, ky kyVar) {
        TextClassification m1497tryGetTextClassificationFDrldGo = m1497tryGetTextClassificationFDrldGo(charSequence, j);
        if (m1497tryGetTextClassificationFDrldGo == null) {
            kyVar.invoke(textContextMenuBuilderScope);
            return;
        }
        if (!m1497tryGetTextClassificationFDrldGo.getActions().isEmpty()) {
            TextContextMenuBuilderScope_androidKt.textClassificationItem(textContextMenuBuilderScope, this.AssistantItemKey, m1497tryGetTextClassificationFDrldGo, 0);
        } else if (TextClassifierHelperMethods.INSTANCE.hasLegacyAssistItem$foundation(m1497tryGetTextClassificationFDrldGo)) {
            TextContextMenuBuilderScope_androidKt.textClassificationItem(textContextMenuBuilderScope, this.AssistantItemKey, m1497tryGetTextClassificationFDrldGo, -1);
        }
        kyVar.invoke(textContextMenuBuilderScope);
        List<RemoteAction> actions = m1497tryGetTextClassificationFDrldGo.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                TextContextMenuBuilderScope_androidKt.textClassificationItem(textContextMenuBuilderScope, this.AssistantItemKey, m1497tryGetTextClassificationFDrldGo, i);
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.PlatformSelectionBehaviors
    /* renamed from: onShowContextMenu-_2OEclM */
    public Object mo1489onShowContextMenu_2OEclM(CharSequence charSequence, long j, Offset offset, hm hmVar) {
        Object m1495onShowContextMenuOrSelectionToolbarSbBc2M = m1495onShowContextMenuOrSelectionToolbarSbBc2M(charSequence, j, hmVar);
        return m1495onShowContextMenuOrSelectionToolbarSbBc2M == vn.d ? m1495onShowContextMenuOrSelectionToolbarSbBc2M : w01.a;
    }

    @Override // androidx.compose.foundation.text.selection.PlatformSelectionBehaviors
    /* renamed from: onShowSelectionToolbar-Sb-Bc2M */
    public Object mo1490onShowSelectionToolbarSbBc2M(CharSequence charSequence, long j, hm hmVar) {
        Object m1495onShowContextMenuOrSelectionToolbarSbBc2M = m1495onShowContextMenuOrSelectionToolbarSbBc2M(charSequence, j, hmVar);
        return m1495onShowContextMenuOrSelectionToolbarSbBc2M == vn.d ? m1495onShowContextMenuOrSelectionToolbarSbBc2M : w01.a;
    }

    @Override // androidx.compose.foundation.text.selection.PlatformSelectionBehaviors
    /* renamed from: suggestSelectionForLongPressOrDoubleClick-pYaCw-w */
    public Object mo1491suggestSelectionForLongPressOrDoubleClickpYaCww(CharSequence charSequence, long j, hm hmVar) {
        if (charSequence.length() == 0 || TextRange.m7054getCollapsedimpl(j)) {
            return null;
        }
        return requireTextClassificationSession(new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(charSequence, j, this, null), hmVar);
    }

    /* renamed from: tryGetTextClassification-FDrldGo, reason: not valid java name */
    public final TextClassification m1497tryGetTextClassificationFDrldGo(CharSequence charSequence, long j) {
        boolean m1500canReuseh5sm0ck;
        TextClassification textClassification = null;
        if (!((ob0) this.mutex).e()) {
            return null;
        }
        TextClassificationResult textClassificationResult = getTextClassificationResult();
        if (textClassificationResult != null) {
            m1500canReuseh5sm0ck = PlatformSelectionBehaviors_androidKt.m1500canReuseh5sm0ck(textClassificationResult, charSequence, j);
            if (m1500canReuseh5sm0ck) {
                textClassification = textClassificationResult.getTextClassification();
            }
        }
        ((ob0) this.mutex).f(null);
        return textClassification;
    }
}
