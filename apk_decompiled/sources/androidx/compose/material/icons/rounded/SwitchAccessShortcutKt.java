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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchAccessShortcutKt {
    private static ImageVector _switchAccessShortcut;

    public static final ImageVector getSwitchAccessShortcut(Icons.Rounded rounded) {
        ImageVector imageVector = _switchAccessShortcut;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwitchAccessShortcut", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.06f, 8.94f, 5.0f, 8.0f);
        i.lineToRelative(2.06f, -0.94f);
        i.lineTo(8.0f, 5.0f);
        i.lineToRelative(0.94f, 2.06f);
        i.lineTo(11.0f, 8.0f);
        i.lineTo(8.94f, 8.94f);
        r6.C(i, 8.0f, 11.0f, 7.06f, 8.94f);
        i.moveTo(8.0f, 21.0f);
        i.lineToRelative(0.94f, -2.06f);
        i.lineTo(11.0f, 18.0f);
        i.lineToRelative(-2.06f, -0.94f);
        i.lineTo(8.0f, 15.0f);
        i.lineToRelative(-0.94f, 2.06f);
        i.lineTo(5.0f, 18.0f);
        gy.B(i, 2.06f, 0.94f, 8.0f, 21.0f);
        i.moveTo(4.37f, 12.37f);
        i.lineTo(3.0f, 13.0f);
        i.lineToRelative(1.37f, 0.63f);
        i.lineTo(5.0f, 15.0f);
        i.lineToRelative(0.63f, -1.37f);
        i.lineTo(7.0f, 13.0f);
        i.lineToRelative(-1.37f, -0.63f);
        r6.C(i, 5.0f, 11.0f, 4.37f, 12.37f);
        i.moveTo(19.0f, 20.41f);
        i.curveToRelative(0.0f, 0.78f, -0.84f, 1.25f, -1.51f, 0.86f);
        i.curveTo(14.21f, 19.36f, 12.0f, 15.79f, 12.0f, 12.0f);
        i.curveToRelative(0.0f, -2.73f, 1.08f, -5.27f, 2.75f, -7.25f);
        i.lineToRelative(-1.9f, -1.9f);
        i.curveTo(12.54f, 2.54f, 12.76f, 2.0f, 13.21f, 2.0f);
        i.horizontalLineToRelative(5.29f);
        i.curveTo(18.78f, 2.0f, 19.0f, 2.22f, 19.0f, 2.5f);
        i.verticalLineToRelative(5.29f);
        i.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f);
        i.lineToRelative(-1.97f, -1.97f);
        i.curveTo(14.84f, 7.82f, 14.0f, 9.88f, 14.0f, 12.0f);
        i.curveToRelative(0.0f, 3.13f, 1.86f, 6.01f, 4.51f, 7.55f);
        i.curveTo(18.81f, 19.73f, 19.0f, 20.06f, 19.0f, 20.41f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchAccessShortcut = build;
        build.getClass();
        return build;
    }
}
