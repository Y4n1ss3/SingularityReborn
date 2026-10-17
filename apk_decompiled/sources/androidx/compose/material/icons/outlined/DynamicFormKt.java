package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DynamicFormKt {
    private static ImageVector _dynamicForm;

    public static final ImageVector getDynamicForm(Icons.Outlined outlined) {
        ImageVector imageVector = _dynamicForm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DynamicForm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(13.0f, 11.0f, 4.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        uo.r(d, 9.0f, 11.0f, 4.0f, 9.0f);
        kf0.i(d, 7.0f, 6.0f, 4.0f, 9.0f);
        d.moveTo(15.0f, 20.0f);
        d.horizontalLineTo(4.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.verticalLineToRelative(-3.0f);
        d.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        uo.r(d, 11.0f, 20.0f, 4.0f, 18.0f);
        gy.t(d, 9.0f, -3.0f, 4.0f, 18.0f);
        d.moveTo(22.0f, 9.0f);
        kf0.B(d, -2.0f, 2.0f, -5.0f, -7.0f);
        kf0.z(d, 7.0f, 2.0f, 9.0f);
        uo.l(d, 22.0f, 9.0f, 4.75f, 17.25f);
        bv.l(d, 1.5f, -1.5f, -1.5f, 17.25f);
        k4.C(d, 4.75f, 8.25f, 1.5f, -1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, -1.5f, 8.25f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dynamicForm = build;
        build.getClass();
        return build;
    }
}
