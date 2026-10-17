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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonOffKt {
    private static ImageVector _personOff;

    public static final ImageVector getPersonOff(Icons.Rounded rounded) {
        ImageVector imageVector = _personOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PersonOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.65f, 5.82f);
        b.curveTo(9.36f, 4.72f, 10.6f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        b.curveToRelative(0.0f, 1.4f, -0.72f, 2.64f, -1.82f, 3.35f);
        uo.l(b, 8.65f, 5.82f, 20.0f, 17.17f);
        b.curveToRelative(-0.02f, -1.1f, -0.63f, -2.11f, -1.61f, -2.62f);
        b.curveToRelative(-0.54f, -0.28f, -1.13f, -0.54f, -1.77f, -0.76f);
        uo.l(b, 20.0f, 17.17f, 20.49f, 20.49f);
        b.lineTo(3.51f, 3.51f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(8.18f, 8.18f);
        b.curveToRelative(-1.82f, 0.23f, -3.41f, 0.8f, -4.7f, 1.46f);
        b.curveTo(4.6f, 15.08f, 4.0f, 16.11f, 4.0f, 17.22f);
        b.lineTo(4.0f, 20.0f);
        b.horizontalLineToRelative(13.17f);
        b.lineToRelative(1.9f, 1.9f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personOff = build;
        build.getClass();
        return build;
    }
}
