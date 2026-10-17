package androidx.compose.material.icons.sharp;

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
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OnlinePredictionKt {
    private static ImageVector _onlinePrediction;

    public static final ImageVector getOnlinePrediction(Icons.Sharp sharp) {
        ImageVector imageVector = _onlinePrediction;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.OnlinePrediction", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.5f, 11.5f);
        b.curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        b.curveTo(8.5f, 9.57f, 10.07f, 8.0f, 12.0f, 8.0f);
        b.reflectiveCurveTo(15.5f, 9.57f, 15.5f, 11.5f);
        af0.r(b, 13.0f, 17.5f, -2.0f, 19.0f);
        uo.r(b, 2.0f, 17.5f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, -2.76f, -1.12f, -5.26f, -2.93f, -7.07f);
        b.lineToRelative(-1.06f, 1.06f);
        b.curveTo(19.55f, 7.53f, 20.5f, 9.66f, 20.5f, 12.0f);
        b.curveToRelative(0.0f, 2.34f, -0.95f, 4.47f, -2.49f, 6.01f);
        b.lineToRelative(1.06f, 1.06f);
        b.curveTo(20.88f, 17.26f, 22.0f, 14.76f, 22.0f, 12.0f);
        b.close();
        b.moveTo(3.5f, 12.0f);
        b.curveToRelative(0.0f, -2.34f, 0.95f, -4.47f, 2.49f, -6.01f);
        b.lineTo(4.93f, 4.93f);
        b.curveTo(3.12f, 6.74f, 2.0f, 9.24f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 2.76f, 1.12f, 5.26f, 2.93f, 7.07f);
        b.lineToRelative(1.06f, -1.06f);
        b.curveTo(4.45f, 16.47f, 3.5f, 14.34f, 3.5f, 12.0f);
        b.close();
        b.moveTo(17.5f, 12.0f);
        b.curveToRelative(0.0f, 1.52f, -0.62f, 2.89f, -1.61f, 3.89f);
        b.lineToRelative(1.06f, 1.06f);
        b.curveTo(18.22f, 15.68f, 19.0f, 13.93f, 19.0f, 12.0f);
        b.curveToRelative(0.0f, -1.93f, -0.78f, -3.68f, -2.05f, -4.95f);
        b.lineToRelative(-1.06f, 1.06f);
        b.curveTo(16.88f, 9.11f, 17.5f, 10.48f, 17.5f, 12.0f);
        k4.x(b, 7.05f, 16.95f, 1.06f, -1.06f);
        b.curveToRelative(-1.0f, -1.0f, -1.61f, -2.37f, -1.61f, -3.89f);
        b.curveToRelative(0.0f, -1.52f, 0.62f, -2.89f, 1.61f, -3.89f);
        b.lineTo(7.05f, 7.05f);
        b.curveTo(5.78f, 8.32f, 5.0f, 10.07f, 5.0f, 12.0f);
        b.curveTo(5.0f, 13.93f, 5.78f, 15.68f, 7.05f, 16.95f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _onlinePrediction = build;
        build.getClass();
        return build;
    }
}
