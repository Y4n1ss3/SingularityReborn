package androidx.compose.material.icons.twotone;

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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenRotationKt {
    private static ImageVector _screenRotation;

    public static final ImageVector getScreenRotation(Icons.TwoTone twoTone) {
        ImageVector imageVector = _screenRotation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ScreenRotation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(af0.i(14.828f, 21.192f, 2.808f, 9.172f), 6.357f, -6.357f, 12.02f, 12.02f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.48f, 2.52f);
        b.curveToRelative(3.27f, 1.55f, 5.61f, 4.72f, 5.97f, 8.48f);
        b.horizontalLineToRelative(1.5f);
        b.curveTo(23.44f, 4.84f, 18.29f, 0.0f, 12.0f, 0.0f);
        b.lineToRelative(-0.66f, 0.03f);
        fc.C(b, 3.81f, 3.81f, 1.33f, -1.32f);
        b.moveTo(10.23f, 1.75f);
        b.curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f);
        b.lineTo(1.75f, 8.11f);
        b.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        b.lineToRelative(12.02f, 12.02f);
        b.curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f);
        b.lineToRelative(6.36f, -6.36f);
        b.curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f);
        uo.l(b, 10.23f, 1.75f, 14.83f, 21.19f);
        b.lineTo(2.81f, 9.17f);
        b.lineToRelative(6.36f, -6.36f);
        fc.C(b, 12.02f, 12.02f, -6.36f, 6.36f);
        b.moveTo(7.52f, 21.48f);
        b.curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f);
        b.lineTo(0.05f, 13.0f);
        b.curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f);
        b.lineToRelative(0.66f, -0.03f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, -3.81f, -3.81f, -1.33f, 1.32f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenRotation = build;
        build.getClass();
        return build;
    }
}
