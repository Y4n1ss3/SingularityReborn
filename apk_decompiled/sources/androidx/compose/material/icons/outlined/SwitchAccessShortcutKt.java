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
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchAccessShortcutKt {
    private static ImageVector _switchAccessShortcut;

    public static final ImageVector getSwitchAccessShortcut(Icons.Outlined outlined) {
        ImageVector imageVector = _switchAccessShortcut;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SwitchAccessShortcut", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        i.moveTo(12.0f, 12.0f);
        i.curveToRelative(0.0f, -3.09f, 1.38f, -5.94f, 3.44f, -8.0f);
        fc.t(i, 12.0f, 4.0f, 2.0f, 7.0f);
        gy.C(i, 7.0f, -2.0f, 0.0f, -3.72f);
        i.curveToRelative(-1.8f, 1.74f, -3.0f, 4.2f, -3.0f, 6.72f);
        i.curveToRelative(0.0f, 3.32f, 2.1f, 6.36f, 5.0f, 7.82f);
        i.lineTo(19.0f, 22.0f);
        i.curveTo(14.91f, 20.41f, 12.0f, 16.35f, 12.0f, 12.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchAccessShortcut = build;
        build.getClass();
        return build;
    }
}
