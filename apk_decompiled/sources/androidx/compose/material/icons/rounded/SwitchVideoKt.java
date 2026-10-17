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
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchVideoKt {
    private static ImageVector _switchVideo;

    public static final ImageVector getSwitchVideo(Icons.Rounded rounded) {
        ImageVector imageVector = _switchVideo;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwitchVideo", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.0f, 9.5f, 18.0f, 6.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.lineTo(3.0f, 5.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-3.5f);
        i.lineToRelative(2.29f, 2.29f);
        i.curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f);
        i.lineTo(22.0f, 7.91f);
        i.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        uo.l(i, 18.0f, 9.5f, 13.0f, 15.5f);
        i.lineTo(13.0f, 13.0f);
        i.lineTo(7.0f, 13.0f);
        i.verticalLineToRelative(2.5f);
        i.lineToRelative(-3.15f, -3.15f);
        i.curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f);
        i.lineTo(7.0f, 8.5f);
        i.lineTo(7.0f, 11.0f);
        i.horizontalLineToRelative(6.0f);
        i.lineTo(13.0f, 8.5f);
        i.lineToRelative(3.15f, 3.15f);
        i.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 13.0f, 15.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchVideo = build;
        build.getClass();
        return build;
    }
}
