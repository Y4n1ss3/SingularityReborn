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
import defpackage.af0;
import defpackage.fc;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MicNoneKt {
    private static ImageVector _micNone;

    public static final ImageVector getMicNone(Icons.Filled filled) {
        ImageVector imageVector = _micNone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MicNone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 14.0f);
        b.curveToRelative(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        b.lineTo(15.0f, 5.0f);
        b.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        b.reflectiveCurveTo(9.0f, 3.34f, 9.0f, 5.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.close();
        b.moveTo(10.8f, 4.9f);
        b.curveToRelative(0.0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f);
        b.curveToRelative(0.66f, 0.0f, 1.2f, 0.54f, 1.2f, 1.2f);
        b.lineToRelative(-0.01f, 6.2f);
        b.curveToRelative(0.0f, 0.66f, -0.53f, 1.2f, -1.19f, 1.2f);
        b.curveToRelative(-0.66f, 0.0f, -1.2f, -0.54f, -1.2f, -1.2f);
        uo.l(b, 10.8f, 4.9f, 17.3f, 11.0f);
        b.curveToRelative(0.0f, 3.0f, -2.54f, 5.1f, -5.3f, 5.1f);
        b.reflectiveCurveTo(6.7f, 14.0f, 6.7f, 11.0f);
        b.lineTo(5.0f, 11.0f);
        b.curveToRelative(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
        fc.w(b, 11.0f, 21.0f, 2.0f, -3.28f);
        b.curveToRelative(3.28f, -0.48f, 6.0f, -3.3f, 6.0f, -6.72f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(b, -1.7f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micNone = build;
        build.getClass();
        return build;
    }
}
