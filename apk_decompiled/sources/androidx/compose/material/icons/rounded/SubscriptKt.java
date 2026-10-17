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
import defpackage.af0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SubscriptKt {
    private static ImageVector _subscript;

    public static final ImageVector getSubscript(Icons.Rounded rounded) {
        ImageVector imageVector = _subscript;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Subscript", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(10.52f, 10.73f, 7.3f, 5.72f);
        i.curveTo(6.82f, 4.97f, 7.35f, 4.0f, 8.23f, 4.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(0.39f, 0.0f, 0.74f, 0.2f, 0.95f, 0.53f);
        i.lineToRelative(2.76f, 4.46f);
        i.horizontalLineToRelative(0.12f);
        i.lineToRelative(2.74f, -4.45f);
        i.curveTo(15.01f, 4.2f, 15.37f, 4.0f, 15.76f, 4.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(0.88f, 0.0f, 1.42f, 0.98f, 0.94f, 1.72f);
        i.lineToRelative(-3.23f, 5.0f);
        i.lineToRelative(3.55f, 5.55f);
        i.curveTo(17.5f, 17.02f, 16.96f, 18.0f, 16.08f, 18.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(-0.38f, 0.0f, -0.74f, -0.2f, -0.95f, -0.52f);
        i.lineToRelative(-3.07f, -4.89f);
        i.horizontalLineToRelative(-0.12f);
        i.lineToRelative(-3.07f, 4.89f);
        i.curveTo(8.67f, 17.8f, 8.31f, 18.0f, 7.92f, 18.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(-0.88f, 0.0f, -1.42f, -0.97f, -0.94f, -1.72f);
        uo.l(i, 10.52f, 10.73f, 23.0f, 19.5f);
        i.lineTo(23.0f, 19.5f);
        i.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        i.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        af0.u(i, 20.0f, -1.0f, 2.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-1.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.horizontalLineToRelative(-2.5f);
        i.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        af0.u(i, 22.0f, 1.0f, -2.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(1.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(2.5f);
        i.curveTo(22.78f, 20.0f, 23.0f, 19.78f, 23.0f, 19.5f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _subscript = build;
        build.getClass();
        return build;
    }
}
