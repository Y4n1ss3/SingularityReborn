package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListItemProviderImpl;
import androidx.compose.foundation.lazy.LazyListItemProviderKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.foundation.pager.PagerLayoutIntervalContent;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.SearchBarValue;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationKt;
import androidx.compose.runtime.internal.AwaiterQueue;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.Density;
import com.lumi.singularity.ui.activities.DomainBlockerActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class p9 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ p9(SheetState sheetState, un unVar, iy iyVar) {
        this.d = 9;
        this.f = sheetState;
        this.e = unVar;
        this.g = iyVar;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 addAwaiter$lambda$1;
        Rect bringIntoView$lambda$1;
        w01 CommonContextMenuArea$lambda$3$0;
        w01 CommonContextMenuArea$lambda$10$0;
        boolean expandable_3_2CpT8$lambda$25$lambda$24;
        PagerLayoutIntervalContent rememberPagerItemProviderLambda$lambda$0$0;
        LazyListItemProviderImpl rememberLazyListItemProviderLambda$lambda$0$1;
        w01 ModalBottomSheet_YbuCTN8$lambda$4$lambda$3;
        ComposeStackTrace attachComposeStackTrace$lambda$0;
        SearchBarState rememberSearchBarState$lambda$27$lambda$26;
        w01 LinksComposables$lambda$0$2$0;
        boolean ClockText$lambda$74$lambda$73;
        int i = this.d;
        int i2 = 11;
        int i3 = 1;
        hm hmVar = null;
        w01 w01Var = w01.a;
        Object obj = this.f;
        Object obj2 = this.g;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                p01.t((un) obj3, null, null, new ea((MutableState) obj, (MutableState) obj2, hmVar, 0), 3);
                break;
            case 1:
                addAwaiter$lambda$1 = AwaiterQueue.addAwaiter$lambda$1((AwaiterQueue.Awaiter) obj3, (AwaiterQueue) obj, (hi0) obj2);
                break;
            case 2:
                bringIntoView$lambda$1 = BringIntoViewResponderNode.bringIntoView$lambda$1((BringIntoViewResponderNode) obj3, (LayoutCoordinates) obj, (iy) obj2);
                break;
            case 3:
                CommonContextMenuArea$lambda$3$0 = CommonContextMenuAreaKt.CommonContextMenuArea$lambda$3$0((un) obj3, (MutableState) obj, (TextFieldSelectionManager) obj2);
                break;
            case 4:
                CommonContextMenuArea$lambda$10$0 = CommonContextMenuAreaKt.CommonContextMenuArea$lambda$10$0((un) obj3, (MutableState) obj, (TextFieldSelectionState) obj2);
                break;
            case 5:
                expandable_3_2CpT8$lambda$25$lambda$24 = ExposedDropdownMenuKt.expandable_3_2CpT8$lambda$25$lambda$24((iy) obj3, (String) obj, (SoftwareKeyboardController) obj2);
                break;
            case 6:
                rememberPagerItemProviderLambda$lambda$0$0 = LazyLayoutPagerKt.rememberPagerItemProviderLambda$lambda$0$0((State) obj3, (State) obj, (iy) obj2);
                break;
            case 7:
                rememberLazyListItemProviderLambda$lambda$0$1 = LazyListItemProviderKt.rememberLazyListItemProviderLambda$lambda$0$1((State) obj3, (LazyListState) obj, (LazyItemScopeImpl) obj2);
                break;
            case 8:
                ie ieVar = (ie) obj3;
                g80 g80Var = (g80) obj;
                ky kyVar = (ky) obj2;
                if (ieVar != ie.h) {
                    kyVar.invoke(ieVar);
                    break;
                } else {
                    g80Var.J(new String[]{"*/*"});
                    break;
                }
            case 9:
                ModalBottomSheet_YbuCTN8$lambda$4$lambda$3 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$4$lambda$3((SheetState) obj, (un) obj3, (iy) obj2);
                break;
            case 10:
                attachComposeStackTrace$lambda$0 = OperationKt.attachComposeStackTrace$lambda$0((GapAnchor) obj3, (SlotWriter) obj, (OperationErrorContext) obj2);
                break;
            case 11:
                rememberSearchBarState$lambda$27$lambda$26 = SearchBarKt.rememberSearchBarState$lambda$27$lambda$26((SearchBarValue) obj3, (AnimationSpec) obj, (AnimationSpec) obj2);
                break;
            case Matrix.TranslateX /* 12 */:
                LinksComposables$lambda$0$2$0 = TextLinkScope.LinksComposables$lambda$0$2$0((TextLinkScope) obj3, (AnnotatedString.Range) obj, (UriHandler) obj2);
                break;
            case Matrix.TranslateY /* 13 */:
                ClockText$lambda$74$lambda$73 = TimePickerKt.ClockText$lambda$74$lambda$73((AnalogTimePickerState) obj3, (Density) obj2, (MutableState) obj);
                break;
            case Matrix.TranslateZ /* 14 */:
                p01.t((un) obj3, null, null, new d4((ky) obj2, (MutableState) obj, hmVar, i2), 3);
                break;
            case 15:
                p01.t((un) obj3, null, null, new nz0((rw0) obj, (Context) obj2, hmVar, i3), 3);
                break;
            case 16:
                nq nqVar = nr.a;
                p01.t((un) obj3, hq.d, null, new u3((Context) obj, (ky) obj2, hmVar, i2), 2);
                break;
            default:
                Context context = (Context) obj2;
                ((SharedPreferences) obj3).edit().putBoolean("root_blocker_setup", true).apply();
                ((MutableState) obj).setValue(Boolean.TRUE);
                context.startActivity(new Intent(context, (Class<?>) DomainBlockerActivity.class));
                break;
        }
        return w01Var;
    }

    public /* synthetic */ p9(Object obj, Object obj2, MutableState mutableState, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.f = mutableState;
    }

    public /* synthetic */ p9(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }
}
