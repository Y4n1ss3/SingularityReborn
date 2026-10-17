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
import defpackage.af0;
import defpackage.bv;
import defpackage.c21;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ConnectedTvKt {
    private static ImageVector _connectedTv;

    public static final ImageVector getConnectedTv(Icons.Outlined outlined) {
        ImageVector imageVector = _connectedTv;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ConnectedTv", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 3.0f, 4.0f);
        d.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        af0.v(d, 4.0f, 2.0f, 8.0f, -2.0f);
        d.horizontalLineToRelative(4.0f);
        d.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        d.lineTo(22.0f, 5.0f);
        d.curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
        c21.d(d, 20.0f, 17.0f, 4.0f, 5.0f);
        uo.r(d, 16.0f, 17.0f, 5.0f, 14.0f);
        d.verticalLineToRelative(2.0f);
        d.horizontalLineToRelative(2.0f);
        d.curveTo(7.0f, 14.89f, 6.11f, 14.0f, 5.0f, 14.0f);
        bv.v(d, 5.0f, 11.0f, 1.43f);
        d.curveToRelative(1.97f, 0.0f, 3.57f, 1.6f, 3.57f, 3.57f);
        d.horizontalLineTo(10.0f);
        d.curveTo(10.0f, 13.24f, 7.76f, 11.0f, 5.0f, 11.0f);
        bv.v(d, 5.0f, 8.0f, 1.45f);
        d.curveToRelative(3.61f, 0.0f, 6.55f, 2.93f, 6.55f, 6.55f);
        d.horizontalLineTo(13.0f);
        d.curveTo(13.0f, 11.58f, 9.41f, 8.0f, 5.0f, 8.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectedTv = build;
        build.getClass();
        return build;
    }
}
