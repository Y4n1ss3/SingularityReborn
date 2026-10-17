package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsListener;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import defpackage.dd0;
import defpackage.k4;
import defpackage.ky;
import defpackage.oa0;
import defpackage.q10;
import defpackage.xa0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidAutofillManager extends AutofillManager implements SemanticsListener, FocusListener {
    public static final int $stable = 8;
    private oa0 currentlyDisplayedIDs;
    private final String packageName;
    private boolean pendingAutofillCommit;
    private PlatformAutofillManager platformAutofillManager;
    private final RectManager rectManager;
    private Rect reusableRect = new Rect();
    private AutofillId rootAutofillId;
    private final SemanticsOwner semanticsOwner;
    private final View view;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidAutofillManager(PlatformAutofillManager platformAutofillManager, SemanticsOwner semanticsOwner, View view, RectManager rectManager, String str) {
        this.platformAutofillManager = platformAutofillManager;
        this.semanticsOwner = semanticsOwner;
        this.view = view;
        this.rectManager = rectManager;
        this.packageName = str;
        view.setImportantForAutofill(1);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(view);
        AutofillId autofillId2 = autofillId != null ? autofillId.toAutofillId() : null;
        if (autofillId2 == null) {
            throw k4.a("Required value was null.");
        }
        this.rootAutofillId = autofillId2;
        this.currentlyDisplayedIDs = new oa0();
    }

    @Override // androidx.compose.ui.autofill.AutofillManager
    public void cancel() {
        this.platformAutofillManager.cancel();
    }

    @Override // androidx.compose.ui.autofill.AutofillManager
    public void commit() {
        this.platformAutofillManager.commit();
    }

    public final PlatformAutofillManager getPlatformAutofillManager() {
        return this.platformAutofillManager;
    }

    public final void onDetach$ui(SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.h(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onEndApplyChanges$ui() {
        if (this.currentlyDisplayedIDs.d == 0 && this.pendingAutofillCommit) {
            this.platformAutofillManager.commit();
            this.pendingAutofillCommit = false;
        }
        if (this.currentlyDisplayedIDs.d != 0) {
            this.pendingAutofillCommit = true;
        }
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public void onFocusChanged(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        SemanticsInfo requireSemanticsInfo;
        SemanticsConfiguration semanticsConfiguration;
        boolean isAutofillable;
        SemanticsInfo requireSemanticsInfo2;
        SemanticsConfiguration semanticsConfiguration2;
        boolean isAutofillable2;
        if (focusTargetModifierNode != null && (requireSemanticsInfo2 = DelegatableNodeKt.requireSemanticsInfo(focusTargetModifierNode)) != null && (semanticsConfiguration2 = requireSemanticsInfo2.getSemanticsConfiguration()) != null) {
            isAutofillable2 = AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration2);
            if (isAutofillable2) {
                this.platformAutofillManager.notifyViewExited(this.view, requireSemanticsInfo2.getSemanticsId());
            }
        }
        if (focusTargetModifierNode2 == null || (requireSemanticsInfo = DelegatableNodeKt.requireSemanticsInfo(focusTargetModifierNode2)) == null || (semanticsConfiguration = requireSemanticsInfo.getSemanticsConfiguration()) == null) {
            return;
        }
        isAutofillable = AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration);
        if (isAutofillable) {
            int semanticsId = requireSemanticsInfo.getSemanticsId();
            this.rectManager.getRects().withRect(semanticsId, new AndroidAutofillManager$onFocusChanged$2$1(this, semanticsId));
        }
    }

    public final void onLayoutNodeDeactivated$ui(SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.h(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onPostAttach$ui(SemanticsInfo semanticsInfo) {
        boolean isRelatedToAutoCommit;
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration != null) {
            isRelatedToAutoCommit = AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration);
            if (isRelatedToAutoCommit) {
                this.currentlyDisplayedIDs.b(semanticsInfo.getSemanticsId());
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
            }
        }
    }

    public final void onPostLayoutNodeReused$ui(SemanticsInfo semanticsInfo, int i) {
        boolean isRelatedToAutoCommit;
        if (this.currentlyDisplayedIDs.h(i)) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, i, false);
        }
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration != null) {
            isRelatedToAutoCommit = AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration);
            if (isRelatedToAutoCommit) {
                this.currentlyDisplayedIDs.b(semanticsInfo.getSemanticsId());
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.semantics.SemanticsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSemanticsChanged(SemanticsInfo semanticsInfo, SemanticsConfiguration semanticsConfiguration) {
        boolean z;
        boolean isRelatedToAutoCommit;
        boolean isRelatedToAutoCommit2;
        AnnotatedString annotatedString;
        AnnotatedString annotatedString2;
        SemanticsConfiguration semanticsConfiguration2 = semanticsInfo.getSemanticsConfiguration();
        int semanticsId = semanticsInfo.getSemanticsId();
        String text = (semanticsConfiguration == null || (annotatedString2 = (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString2.getText();
        String text2 = (semanticsConfiguration2 == null || (annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString.getText();
        boolean z2 = false;
        if (text != text2) {
            if (text == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, true);
            } else if (text2 == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, false);
            } else if (q10.b((ContentDataType) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getContentDataType()), ContentDataType.Companion.getText())) {
                this.platformAutofillManager.notifyValueChanged(this.view, semanticsId, AutofillApi26Helper.INSTANCE.getAutofillTextValue(text2));
            }
        }
        ToggleableState toggleableState = semanticsConfiguration != null ? (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getToggleableState()) : null;
        ToggleableState toggleableState2 = semanticsConfiguration2 != null ? (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getToggleableState()) : null;
        if (toggleableState != toggleableState2) {
            if (toggleableState == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, true);
            } else if (toggleableState2 == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, false);
            } else if (q10.b((ContentDataType) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getContentDataType()), ContentDataType.Companion.getToggle())) {
                int i = WhenMappings.$EnumSwitchMapping$0[toggleableState2.ordinal()];
                Boolean bool = i != 1 ? i != 2 ? null : Boolean.FALSE : Boolean.TRUE;
                if (bool != null) {
                    this.platformAutofillManager.notifyValueChanged(this.view, semanticsId, AutofillApi26Helper.INSTANCE.getAutofillToggleValue(bool.booleanValue()));
                }
            }
        }
        FillableData fillableData = semanticsConfiguration != null ? (FillableData) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getFillableData()) : null;
        FillableData fillableData2 = semanticsConfiguration2 != null ? (FillableData) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getFillableData()) : null;
        if (!q10.b(fillableData, fillableData2)) {
            if (fillableData == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, true);
            } else {
                PlatformAutofillManager platformAutofillManager = this.platformAutofillManager;
                if (fillableData2 == null) {
                    platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, false);
                } else {
                    platformAutofillManager.notifyValueChanged(this.view, semanticsId, ((AndroidFillableData) fillableData2).getAutofillValue$ui());
                }
            }
        }
        if (semanticsConfiguration != null) {
            isRelatedToAutoCommit2 = AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration);
            if (isRelatedToAutoCommit2) {
                z = true;
                if (semanticsConfiguration2 != null) {
                    isRelatedToAutoCommit = AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration2);
                    if (isRelatedToAutoCommit) {
                        z2 = true;
                    }
                }
                if (z == z2) {
                    oa0 oa0Var = this.currentlyDisplayedIDs;
                    if (z2) {
                        oa0Var.b(semanticsId);
                        return;
                    } else {
                        oa0Var.h(semanticsId);
                        return;
                    }
                }
                return;
            }
        }
        z = false;
        if (semanticsConfiguration2 != null) {
        }
        if (z == z2) {
        }
    }

    public final void performAutofill(SparseArray<AutofillValue> sparseArray) {
        SemanticsConfiguration semanticsConfiguration;
        ky kyVar;
        ky kyVar2;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = sparseArray.get(keyAt);
            SemanticsInfo semanticsInfo = this.semanticsOwner.get$ui(keyAt);
            if (semanticsInfo != null && (semanticsConfiguration = semanticsInfo.getSemanticsConfiguration()) != null) {
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, semanticsActions.getOnAutofillText());
                if (accessibilityAction != null && (kyVar2 = (ky) accessibilityAction.getAction()) != null) {
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, semanticsActions.getOnFillData());
                if (accessibilityAction2 != null && (kyVar = (ky) accessibilityAction2.getAction()) != null) {
                }
            }
        }
    }

    public final void populateViewStructure(ViewStructure viewStructure) {
        boolean isRelatedToAutofill;
        AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
        SemanticsInfo rootInfo$ui = this.semanticsOwner.getRootInfo$ui();
        PopulateViewStructure_androidKt.populate(viewStructure, rootInfo$ui, this.rootAutofillId, this.packageName, this.rectManager);
        Object[] objArr = dd0.a;
        xa0 xa0Var = new xa0(2);
        xa0Var.g(rootInfo$ui);
        xa0Var.g(viewStructure);
        while (xa0Var.e()) {
            Object l = xa0Var.l(xa0Var.b - 1);
            l.getClass();
            ViewStructure viewStructure2 = (ViewStructure) l;
            Object l2 = xa0Var.l(xa0Var.b - 1);
            l2.getClass();
            List<SemanticsInfo> childrenInfo = ((SemanticsInfo) l2).getChildrenInfo();
            int size = childrenInfo.size();
            for (int i = 0; i < size; i++) {
                SemanticsInfo semanticsInfo = childrenInfo.get(i);
                if (!semanticsInfo.isDeactivated() && semanticsInfo.isAttached() && semanticsInfo.isPlaced()) {
                    SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
                    if (semanticsConfiguration != null) {
                        isRelatedToAutofill = AndroidAutofillManager_androidKt.isRelatedToAutofill(semanticsConfiguration);
                        if (isRelatedToAutofill) {
                            ViewStructure newChild = autofillApi26Helper.newChild(viewStructure2, autofillApi26Helper.addChildCount(viewStructure2, 1));
                            PopulateViewStructure_androidKt.populate(newChild, semanticsInfo, this.rootAutofillId, this.packageName, this.rectManager);
                            xa0Var.g(semanticsInfo);
                            xa0Var.g(newChild);
                        }
                    }
                    xa0Var.g(semanticsInfo);
                    xa0Var.g(viewStructure2);
                }
            }
        }
    }

    public final void requestAutofill$ui(SemanticsInfo semanticsInfo) {
        this.rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new AndroidAutofillManager$requestAutofill$1(this, semanticsInfo));
    }

    public final void setPlatformAutofillManager(PlatformAutofillManager platformAutofillManager) {
        this.platformAutofillManager = platformAutofillManager;
    }
}
