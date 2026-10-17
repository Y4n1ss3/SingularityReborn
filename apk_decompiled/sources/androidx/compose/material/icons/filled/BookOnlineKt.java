package androidx.compose.material.icons.filled;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BookOnlineKt {
    private static ImageVector _bookOnline;

    public static final ImageVector getBookOnline(Icons.Filled filled) {
        ImageVector imageVector = _bookOnline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BookOnline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(17.0f, 1.0f, 7.0f);
        d.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        d.verticalLineToRelative(18.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(10.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(3.0f);
        d.curveTo(19.0f, 1.9f, 18.1f, 1.0f, 17.0f, 1.0f);
        fc.A(d, 7.0f, 18.0f, 6.0f, 10.0f);
        kf0.n(d, 12.0f, 7.0f, 16.0f, 11.0f);
        d.verticalLineTo(9.14f);
        d.curveTo(16.0f, 8.51f, 15.55f, 8.0f, 15.0f, 8.0f);
        d.horizontalLineTo(9.0f);
        d.curveTo(8.45f, 8.0f, 8.0f, 8.51f, 8.0f, 9.14f);
        d.lineToRelative(0.0f, 1.96f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.lineToRelative(0.0f, 1.76f);
        d.curveTo(8.0f, 15.49f, 8.45f, 16.0f, 9.0f, 16.0f);
        d.horizontalLineToRelative(6.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.51f, 1.0f, -1.14f);
        d.verticalLineTo(13.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.curveTo(15.0f, 11.45f, 15.45f, 11.0f, 16.0f, 11.0f);
        r6.B(d, 12.5f, 14.5f, -1.0f, -1.0f);
        uo.r(d, 1.0f, 14.5f, 12.5f, 12.5f);
        bv.l(d, -1.0f, -1.0f, 1.0f, 12.5f);
        k4.C(d, 12.5f, 10.5f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 1.0f, 10.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookOnline = build;
        build.getClass();
        return build;
    }
}
