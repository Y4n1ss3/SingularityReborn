package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.lumi.singularity.R;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class n7 {
    public final int[] a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    public final int[] b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    public final int[] c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
    public final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    public static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i) {
        int b = uu0.b(context, R.attr.colorControlHighlight);
        int a = uu0.a(context, R.attr.colorButtonNormal);
        int[] iArr = uu0.b;
        int[] iArr2 = uu0.d;
        int b2 = fj.b(b, i);
        return new ColorStateList(new int[][]{iArr, iArr2, uu0.c, uu0.f}, new int[]{a, b2, fj.b(b, i), i});
    }

    public static LayerDrawable c(aj0 aj0Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable d = aj0Var.d(context, R.drawable.abc_star_black_48dp);
        Drawable d2 = aj0Var.d(context, R.drawable.abc_star_half_black_48dp);
        if ((d instanceof BitmapDrawable) && d.getIntrinsicWidth() == dimensionPixelSize && d.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) d;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            d.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((d2 instanceof BitmapDrawable) && d2.getIntrinsicWidth() == dimensionPixelSize && d2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) d2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            d2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter f;
        int[] iArr = ns.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = o7.b;
        }
        PorterDuff.Mode mode2 = o7.b;
        synchronized (o7.class) {
            f = aj0.f(i, mode);
        }
        mutate.setColorFilter(f);
    }

    public final ColorStateList d(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return cq.q(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return cq.q(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, uu0.b(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return b(context, uu0.b(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return cq.q(context, R.color.abc_tint_spinner);
            }
            if (a(i, this.b)) {
                return uu0.c(context, R.attr.colorControlNormal);
            }
            if (a(i, this.e)) {
                return cq.q(context, R.color.abc_tint_default);
            }
            if (a(i, this.f)) {
                return cq.q(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return cq.q(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList c = uu0.c(context, R.attr.colorSwitchThumbNormal);
        if (c == null || !c.isStateful()) {
            iArr[0] = uu0.b;
            iArr2[0] = uu0.a(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = uu0.e;
            iArr2[1] = uu0.b(context, R.attr.colorControlActivated);
            iArr[2] = uu0.f;
            iArr2[2] = uu0.b(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = uu0.b;
            iArr[0] = iArr3;
            iArr2[0] = c.getColorForState(iArr3, 0);
            iArr[1] = uu0.e;
            iArr2[1] = uu0.b(context, R.attr.colorControlActivated);
            iArr[2] = uu0.f;
            iArr2[2] = c.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
