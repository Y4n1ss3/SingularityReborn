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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BookOnlineKt {
    private static ImageVector _bookOnline;

    public static final ImageVector getBookOnline(Icons.Outlined outlined) {
        ImageVector imageVector = _bookOnline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BookOnline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(17.0f, 4.0f, 7.0f, 3.0f, 10.0f);
        k4.B(f, 4.0f, 17.0f, 21.0f, 7.0f);
        k4.p(f, -1.0f, 10.0f, 21.0f);
        f.moveTo(17.0f, 1.0f);
        f.horizontalLineTo(7.0f);
        f.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        f.verticalLineToRelative(18.0f);
        f.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f.horizontalLineToRelative(10.0f);
        f.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f.verticalLineTo(3.0f);
        f.curveTo(19.0f, 1.9f, 18.1f, 1.0f, 17.0f, 1.0f);
        uo.l(f, 17.0f, 1.0f, 7.0f, 6.0f);
        gy.t(f, 10.0f, 12.0f, 7.0f, 6.0f);
        f.moveTo(16.0f, 11.0f);
        f.verticalLineTo(9.14f);
        f.curveTo(16.0f, 8.51f, 15.55f, 8.0f, 15.0f, 8.0f);
        f.horizontalLineTo(9.0f);
        f.curveTo(8.45f, 8.0f, 8.0f, 8.51f, 8.0f, 9.14f);
        f.lineToRelative(0.0f, 1.96f);
        f.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        f.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        f.lineToRelative(0.0f, 1.76f);
        f.curveTo(8.0f, 15.49f, 8.45f, 16.0f, 9.0f, 16.0f);
        f.horizontalLineToRelative(6.0f);
        f.curveToRelative(0.55f, 0.0f, 1.0f, -0.51f, 1.0f, -1.14f);
        f.verticalLineTo(13.0f);
        f.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        f.curveTo(15.0f, 11.45f, 15.45f, 11.0f, 16.0f, 11.0f);
        r6.B(f, 12.5f, 14.5f, -1.0f, -1.0f);
        uo.r(f, 1.0f, 14.5f, 12.5f, 12.5f);
        bv.l(f, -1.0f, -1.0f, 1.0f, 12.5f);
        k4.C(f, 12.5f, 10.5f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(f, 1.0f, 10.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookOnline = build;
        build.getClass();
        return build;
    }
}
