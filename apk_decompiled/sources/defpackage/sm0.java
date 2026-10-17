package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.lumi.singularity.R;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class sm0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ SearchView a;

    public sm0(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SearchView searchView = this.a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.s;
        View view2 = searchView.A;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.u.getPaddingLeft();
            Rect rect = new Rect();
            int i9 = d21.a;
            int i10 = u11.a;
            boolean z = searchView.getLayoutDirection() == 1;
            int dimensionPixelSize = searchView.P ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            int i11 = rect.left;
            searchAutoComplete.setDropDownHorizontalOffset(z ? -i11 : paddingLeft - (i11 + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
