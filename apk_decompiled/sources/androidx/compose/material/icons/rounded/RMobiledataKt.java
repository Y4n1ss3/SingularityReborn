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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RMobiledataKt {
    private static ImageVector _rMobiledata;

    public static final ImageVector getRMobiledata(Icons.Rounded rounded) {
        ImageVector imageVector = _rMobiledata;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RMobiledata", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(7.8f, 7.2f, 0.65f, 1.52f);
        e.curveTo(8.71f, 9.33f, 8.27f, 10.0f, 7.61f, 10.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(-0.37f, 0.0f, -0.7f, -0.22f, -0.85f, -0.56f);
        r6.w(e, 5.87f, 7.33f, 4.0f, 1.75f);
        e.curveTo(4.0f, 9.59f, 3.59f, 10.0f, 3.08f, 10.0f);
        e.horizontalLineTo(2.92f);
        e.curveTo(2.41f, 10.0f, 2.0f, 9.59f, 2.0f, 9.08f);
        e.verticalLineTo(3.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.horizontalLineToRelative(4.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        e.verticalLineToRelative(1.33f);
        e.curveTo(9.0f, 6.13f, 8.47f, 6.87f, 7.8f, 7.2f);
        uo.q(e, 7.0f, 4.0f, 4.0f, 1.33f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(e, 3.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rMobiledata = build;
        build.getClass();
        return build;
    }
}
