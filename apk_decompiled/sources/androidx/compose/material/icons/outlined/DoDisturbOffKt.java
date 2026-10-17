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
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoDisturbOffKt {
    private static ImageVector _doDisturbOff;

    public static final ImageVector getDoDisturbOff(Icons.Outlined outlined) {
        ImageVector imageVector = _doDisturbOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DoDisturbOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        b.curveToRelative(0.0f, 1.41f, -0.37f, 2.73f, -1.01f, 3.88f);
        b.lineToRelative(1.46f, 1.46f);
        b.curveTo(21.43f, 15.79f, 22.0f, 13.96f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        b.curveToRelative(-1.96f, 0.0f, -3.79f, 0.57f, -5.33f, 1.55f);
        b.lineToRelative(1.46f, 1.46f);
        b.curveTo(9.27f, 4.37f, 10.59f, 4.0f, 12.0f, 4.0f);
        af0.l(b, 17.0f, 11.0f, -2.88f);
        gy.B(b, 2.0f, 2.0f, 17.0f, 13.0f);
        b.moveTo(2.41f, 2.13f);
        b.lineTo(1.0f, 3.54f);
        b.lineToRelative(2.78f, 2.78f);
        b.curveTo(2.66f, 7.93f, 2.0f, 9.89f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.curveToRelative(2.11f, 0.0f, 4.07f, -0.66f, 5.68f, -1.78f);
        b.lineTo(20.46f, 23.0f);
        gy.B(b, 1.41f, -1.41f, 2.41f, 2.13f);
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.curveToRelative(0.0f, -1.56f, 0.45f, -3.0f, 1.23f, -4.23f);
        b.lineTo(8.46f, 11.0f);
        af0.m(b, 7.0f, 11.0f, 2.0f, 3.46f);
        b.lineToRelative(5.77f, 5.77f);
        b.curveTo(15.0f, 19.55f, 13.56f, 20.0f, 12.0f, 20.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doDisturbOff = build;
        build.getClass();
        return build;
    }
}
