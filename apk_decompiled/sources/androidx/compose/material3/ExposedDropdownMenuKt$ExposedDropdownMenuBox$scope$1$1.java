package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.a9;
import defpackage.h7;
import defpackage.ky;
import defpackage.qu;
import defpackage.ru;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 extends ExposedDropdownMenuBoxScopeImpl {
    final /* synthetic */ MutableState<Boolean> $alwaysFocusable;
    final /* synthetic */ MutableState<ExposedDropdownMenuAnchorType> $anchorTypeState;
    final /* synthetic */ MutableIntState $anchorWidth$delegate;
    final /* synthetic */ String $collapsedDescription;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ String $expandedDescription;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    final /* synthetic */ MutableIntState $menuMaxHeight$delegate;
    final /* synthetic */ ky $onExpandedChange;
    final /* synthetic */ String $toggleDescription;

    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1(FocusRequester focusRequester, boolean z, MutableState<Boolean> mutableState, String str, String str2, String str3, SoftwareKeyboardController softwareKeyboardController, MutableState<ExposedDropdownMenuAnchorType> mutableState2, ky kyVar, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        this.$focusRequester = focusRequester;
        this.$expanded = z;
        this.$alwaysFocusable = mutableState;
        this.$expandedDescription = str;
        this.$collapsedDescription = str2;
        this.$toggleDescription = str3;
        this.$keyboardController = softwareKeyboardController;
        this.$anchorTypeState = mutableState2;
        this.$onExpandedChange = kyVar;
        this.$anchorWidth$delegate = mutableIntState;
        this.$menuMaxHeight$delegate = mutableIntState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult exposedDropdownSize$lambda$3(boolean z, MutableIntState mutableIntState, MutableIntState mutableIntState2, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int intValue;
        int intValue2;
        long m7570unboximpl = constraints.m7570unboximpl();
        intValue = mutableIntState.getIntValue();
        int m7581constrainWidthK40F9xA = ConstraintsKt.m7581constrainWidthK40F9xA(m7570unboximpl, intValue);
        long m7570unboximpl2 = constraints.m7570unboximpl();
        intValue2 = mutableIntState2.getIntValue();
        int m7580constrainHeightK40F9xA = ConstraintsKt.m7580constrainHeightK40F9xA(m7570unboximpl2, intValue2);
        int m7566getMinWidthimpl = z ? m7581constrainWidthK40F9xA : Constraints.m7566getMinWidthimpl(constraints.m7570unboximpl());
        if (!z) {
            m7581constrainWidthK40F9xA = Constraints.m7564getMaxWidthimpl(constraints.m7570unboximpl());
        }
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(constraints.m7570unboximpl(), m7566getMinWidthimpl, m7581constrainWidthK40F9xA, 0, m7580constrainHeightK40F9xA, 4, null));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new h7(4, mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 exposedDropdownSize$lambda$3$lambda$2(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 menuAnchor_2Hz36ac$lambda$0(String str, MutableState mutableState) {
        boolean m1975hasGreaterOrEqualPriorityThanvVDBVkM;
        m1975hasGreaterOrEqualPriorityThanvVDBVkM = ExposedDropdownMenuKt.m1975hasGreaterOrEqualPriorityThanvVDBVkM(str, ((ExposedDropdownMenuAnchorType) mutableState.getValue()).m1955unboximpl());
        if (m1975hasGreaterOrEqualPriorityThanvVDBVkM) {
            mutableState.setValue(ExposedDropdownMenuAnchorType.m1949boximpl(str));
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 menuAnchor_2Hz36ac$lambda$1(MutableState mutableState, String str, ky kyVar, boolean z) {
        mutableState.setValue(ExposedDropdownMenuAnchorType.m1949boximpl(str));
        kyVar.invoke(Boolean.valueOf(!z));
        return w01.a;
    }

    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
    public Modifier exposedDropdownSize(Modifier modifier, boolean z) {
        return LayoutModifierKt.layout(modifier, new a9(1, this.$anchorWidth$delegate, z, this.$menuMaxHeight$delegate));
    }

    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
    public boolean getAlwaysFocusable$material3() {
        return this.$alwaysFocusable.getValue().booleanValue();
    }

    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
    /* renamed from: getAnchorType-oYjWRB4$material3 */
    public String mo1962getAnchorTypeoYjWRB4$material3() {
        return this.$anchorTypeState.getValue().m1955unboximpl();
    }

    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
    /* renamed from: menuAnchor-2Hz36ac */
    public Modifier mo1963menuAnchor2Hz36ac(Modifier modifier, String str, boolean z) {
        Modifier m1974expandable32CpT8;
        Modifier then = FocusRequesterModifierKt.focusRequester(modifier, this.$focusRequester).then(new ExposedDropdownMenuAnchorElement(new qu(str, this.$anchorTypeState, 0)));
        if (z) {
            Modifier.Companion companion = Modifier.Companion;
            boolean z2 = this.$expanded;
            m1974expandable32CpT8 = ExposedDropdownMenuKt.m1974expandable32CpT8(companion, z2, new ru(this.$anchorTypeState, str, this.$onExpandedChange, z2), str, this.$alwaysFocusable, this.$expandedDescription, this.$collapsedDescription, this.$toggleDescription, this.$keyboardController);
        } else {
            m1974expandable32CpT8 = Modifier.Companion;
        }
        return then.then(m1974expandable32CpT8);
    }
}
