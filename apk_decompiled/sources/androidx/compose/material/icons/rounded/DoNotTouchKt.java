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
import defpackage.bv;
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoNotTouchKt {
    private static ImageVector _doNotTouch;

    public static final ImageVector getDoNotTouch(Icons.Rounded rounded) {
        ImageVector imageVector = _doNotTouch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DoNotTouch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(13.0f, 10.17f, -2.5f, -2.5f, 2.25f);
        j.curveTo(10.5f, 1.56f, 11.06f, 1.0f, 11.75f, 1.0f);
        j.curveTo(12.44f, 1.0f, 13.0f, 1.56f, 13.0f, 2.25f);
        bv.t(j, 10.17f, 20.0f, 5.32f);
        j.curveToRelative(0.0f, -0.65f, -0.47f, -1.25f, -1.12f, -1.32f);
        j.curveToRelative(-0.75f, -0.08f, -1.38f, 0.51f, -1.38f, 1.24f);
        j.verticalLineToRelative(5.25f);
        j.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        j.horizontalLineToRelative(0.0f);
        j.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        j.lineToRelative(0.0f, -7.18f);
        j.curveToRelative(0.0f, -0.65f, -0.47f, -1.25f, -1.12f, -1.32f);
        j.curveTo(14.63f, 1.93f, 14.0f, 2.52f, 14.0f, 3.25f);
        j.verticalLineToRelative(7.92f);
        gy.B(j, 6.0f, 6.0f, 20.0f, 5.32f);
        j.moveTo(9.5f, 4.25f);
        j.curveTo(9.5f, 3.56f, 8.94f, 3.0f, 8.25f, 3.0f);
        j.curveToRelative(-0.67f, 0.0f, -1.2f, 0.53f, -1.24f, 1.18f);
        uf.o(j, 9.5f, 6.67f, 4.25f);
        j.moveTo(17.0f, 22.0f);
        j.curveToRelative(0.62f, 0.0f, 1.18f, -0.19f, 1.65f, -0.52f);
        j.lineToRelative(-0.02f, -0.02f);
        j.lineToRelative(0.44f, 0.44f);
        j.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        j.lineToRelative(0.0f, 0.0f);
        j.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        j.lineTo(3.51f, 3.51f);
        j.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        j.lineToRelative(0.0f, 0.0f);
        j.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        j.lineToRelative(4.92f, 4.92f);
        j.lineTo(7.0f, 9.83f);
        j.verticalLineToRelative(4.3f);
        j.lineToRelative(-2.6f, -1.48f);
        j.curveToRelative(-0.17f, -0.09f, -0.34f, -0.14f, -0.54f, -0.14f);
        j.curveToRelative(-0.26f, 0.0f, -0.5f, 0.09f, -0.7f, 0.26f);
        j.lineTo(2.0f, 13.88f);
        j.lineToRelative(0.0f, 0.0f);
        j.lineToRelative(6.8f, 7.18f);
        j.curveToRelative(0.57f, 0.6f, 1.35f, 0.94f, 2.18f, 0.94f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(j, 17.0f, 22.0f, 17.0f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotTouch = build;
        build.getClass();
        return build;
    }
}
