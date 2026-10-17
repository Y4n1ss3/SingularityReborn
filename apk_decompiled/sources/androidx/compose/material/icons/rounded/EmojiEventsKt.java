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
import defpackage.fc;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmojiEventsKt {
    private static ImageVector _emojiEvents;

    public static final ImageVector getEmojiEvents(Icons.Rounded rounded) {
        ImageVector imageVector = _emojiEvents;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmojiEvents", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(19.0f, 5.0f, -2.0f, 4.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineTo(8.0f);
        e.curveTo(7.45f, 3.0f, 7.0f, 3.45f, 7.0f, 4.0f);
        e.verticalLineToRelative(1.0f);
        e.horizontalLineTo(5.0f);
        e.curveTo(3.9f, 5.0f, 3.0f, 5.9f, 3.0f, 7.0f);
        e.verticalLineToRelative(1.0f);
        e.curveToRelative(0.0f, 2.55f, 1.92f, 4.63f, 4.39f, 4.94f);
        e.curveToRelative(0.63f, 1.5f, 1.98f, 2.63f, 3.61f, 2.96f);
        e.verticalLineTo(19.0f);
        e.horizontalLineTo(8.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(8.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineToRelative(-3.0f);
        e.verticalLineToRelative(-3.1f);
        e.curveToRelative(1.63f, -0.33f, 2.98f, -1.46f, 3.61f, -2.96f);
        e.curveTo(19.08f, 12.63f, 21.0f, 10.55f, 21.0f, 8.0f);
        e.verticalLineTo(7.0f);
        e.curveTo(21.0f, 5.9f, 20.1f, 5.0f, 19.0f, 5.0f);
        fc.A(e, 5.0f, 8.0f, 7.0f, 2.0f);
        e.verticalLineToRelative(3.82f);
        e.curveTo(5.84f, 10.4f, 5.0f, 9.3f, 5.0f, 8.0f);
        e.close();
        e.moveTo(19.0f, 8.0f);
        e.curveToRelative(0.0f, 1.3f, -0.84f, 2.4f, -2.0f, 2.82f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.r(e, 7.0f, 2.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiEvents = build;
        build.getClass();
        return build;
    }
}
