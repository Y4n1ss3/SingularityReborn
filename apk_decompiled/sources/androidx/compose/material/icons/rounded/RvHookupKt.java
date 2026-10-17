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
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RvHookupKt {
    private static ImageVector _rvHookup;

    public static final ImageVector getRvHookup(Icons.Rounded rounded) {
        ImageVector imageVector = _rvHookup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RvHookup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(21.0f, 17.0f, -1.0f, -6.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.lineTo(7.0f, 9.0f);
        b.verticalLineToRelative(-0.74f);
        b.curveToRelative(0.0f, -0.46f, -0.56f, -0.7f, -0.89f, -0.37f);
        b.lineTo(4.37f, 9.63f);
        b.curveToRelative(-0.2f, 0.2f, -0.2f, 0.53f, 0.0f, 0.74f);
        b.lineToRelative(1.74f, 1.74f);
        b.curveToRelative(0.33f, 0.33f, 0.89f, 0.1f, 0.89f, -0.37f);
        fc.w(b, 7.0f, 11.0f, 4.0f, 3.0f);
        b.lineTo(5.0f, 14.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        b.horizontalLineToRelative(7.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.close();
        b.moveTo(11.0f, 20.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        r6.B(b, 18.0f, 14.0f, -4.0f, -3.0f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        bv.m(b, 2.0f, 10.0f, 6.0f, 7.0f);
        b.verticalLineToRelative(0.74f);
        b.curveToRelative(0.0f, 0.46f, 0.56f, 0.7f, 0.89f, 0.37f);
        b.lineToRelative(1.74f, -1.74f);
        b.curveToRelative(0.2f, -0.2f, 0.2f, -0.53f, 0.0f, -0.74f);
        b.lineToRelative(-1.74f, -1.74f);
        b.curveToRelative(-0.33f, -0.33f, -0.89f, -0.1f, -0.89f, 0.37f);
        b.lineTo(17.0f, 4.0f);
        b.horizontalLineToRelative(-7.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, 0.45f, 1.0f, 1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rvHookup = build;
        build.getClass();
        return build;
    }
}
