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
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BedtimeKt {
    private static ImageVector _bedtime;

    public static final ImageVector getBedtime(Icons.Outlined outlined) {
        ImageVector imageVector = _bedtime;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Bedtime", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.27f, 4.49f);
        b.curveToRelative(-1.63f, 7.54f, 3.75f, 12.41f, 7.66f, 13.8f);
        b.curveTo(15.54f, 19.38f, 13.81f, 20.0f, 12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.curveTo(4.0f, 8.55f, 6.2f, 5.6f, 9.27f, 4.49f);
        b.moveTo(11.99f, 2.01f);
        b.curveTo(6.4f, 2.01f, 2.0f, 6.54f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.curveToRelative(3.71f, 0.0f, 6.93f, -2.02f, 8.66f, -5.02f);
        b.curveToRelative(-7.51f, -0.25f, -12.09f, -8.43f, -8.32f, -14.97f);
        b.curveTo(12.22f, 2.01f, 12.11f, 2.01f, 11.99f, 2.01f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 11.99f, 2.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedtime = build;
        build.getClass();
        return build;
    }
}
