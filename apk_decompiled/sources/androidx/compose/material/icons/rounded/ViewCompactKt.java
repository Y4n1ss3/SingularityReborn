package androidx.compose.material.icons.rounded;

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
import defpackage.j50;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ViewCompactKt {
    private static ImageVector _viewCompact;

    public static final ImageVector getViewCompact(Icons.Rounded rounded) {
        ImageVector imageVector = _viewCompact;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ViewCompact", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(4.0f, 18.0f, 2.5f, -2.5f, 4.0f);
        k4.D(d, 18.0f, 4.0f, 13.25f, 2.5f);
        gy.s(d, -2.5f, 4.0f, 13.25f);
        j50.y(d, 4.0f, 8.5f, 2.5f, 6.0f);
        bv.s(d, 4.0f, 8.5f, 17.5f, 6.0f);
        d.verticalLineToRelative(2.5f);
        d.horizontalLineTo(20.0f);
        d.verticalLineTo(6.0f);
        d.horizontalLineTo(17.5f);
        d.close();
        j50.y(d, 13.0f, 8.5f, 2.5f, 6.0f);
        bv.s(d, 13.0f, 8.5f, 17.5f, 18.0f);
        bv.h(d, 20.0f, -2.5f, -2.5f, 18.0f);
        k4.A(d, 17.5f, 13.25f, 20.0f, -2.5f);
        uo.r(d, -2.5f, 13.25f, 8.5f, 18.0f);
        d.horizontalLineTo(11.0f);
        d.verticalLineToRelative(-2.5f);
        d.horizontalLineTo(8.5f);
        d.verticalLineTo(18.0f);
        d.close();
        k4.C(d, 13.0f, 18.0f, 2.5f, -2.5f);
        bv.s(d, 13.0f, 18.0f, 8.5f, 8.5f);
        d.horizontalLineTo(11.0f);
        d.verticalLineTo(6.0f);
        d.horizontalLineTo(8.5f);
        d.verticalLineTo(8.5f);
        d.close();
        k4.C(d, 13.0f, 13.25f, 2.5f, -2.5f);
        bv.s(d, 13.0f, 13.25f, 8.5f, 13.25f);
        d.horizontalLineTo(11.0f);
        d.verticalLineToRelative(-2.5f);
        d.horizontalLineTo(8.5f);
        d.verticalLineTo(13.25f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewCompact = build;
        build.getClass();
        return build;
    }
}
