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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RoundaboutRightKt {
    private static ImageVector _roundaboutRight;

    public static final ImageVector getRoundaboutRight(Icons.Sharp sharp) {
        ImageVector imageVector = _roundaboutRight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RoundaboutRight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 13.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        b.lineToRelative(0.0f, 1.0f);
        b.lineToRelative(6.17f, 0.0f);
        b.lineToRelative(-1.59f, 1.59f);
        b.lineTo(18.0f, 13.0f);
        b.lineToRelative(4.0f, -4.0f);
        b.lineToRelative(-4.0f, -4.0f);
        b.lineToRelative(-1.41f, 1.41f);
        b.lineTo(18.17f, 8.0f);
        b.lineToRelative(-4.25f, 0.0f);
        b.curveTo(13.44f, 5.16f, 10.97f, 3.0f, 8.0f, 3.0f);
        b.curveTo(4.69f, 3.0f, 2.0f, 5.69f, 2.0f, 9.0f);
        b.curveToRelative(0.0f, 2.97f, 2.16f, 5.44f, 5.0f, 5.92f);
        b.lineTo(7.0f, 21.0f);
        b.horizontalLineToRelative(2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 0.0f, -8.0f, 8.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _roundaboutRight = build;
        build.getClass();
        return build;
    }
}
