package androidx.compose.material3;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SearchBarKt$ExpandedDockedSearchBar$3$3$1", f = "SearchBar.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SearchBarKt$ExpandedDockedSearchBar$3$3$1 extends us0 implements my {
    final /* synthetic */ SoftwareKeyboardController $softwareKeyboardController;
    final /* synthetic */ SearchBarState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$ExpandedDockedSearchBar$3$3$1(SearchBarState searchBarState, SoftwareKeyboardController softwareKeyboardController, hm hmVar) {
        super(2, hmVar);
        this.$state = searchBarState;
        this.$softwareKeyboardController = softwareKeyboardController;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SearchBarKt$ExpandedDockedSearchBar$3$3$1(this.$state, this.$softwareKeyboardController, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SearchBarKt$ExpandedDockedSearchBar$3$3$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        SoftwareKeyboardController softwareKeyboardController;
        if (this.label != 0) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        if (this.$state.getTargetValue() == SearchBarValue.Collapsed && (softwareKeyboardController = this.$softwareKeyboardController) != null) {
            softwareKeyboardController.hide();
        }
        return w01.a;
    }
}
