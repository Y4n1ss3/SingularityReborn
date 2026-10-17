package androidx.compose.material3;

import defpackage.bu;
import defpackage.p01;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScaffoldLayoutContent {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ ScaffoldLayoutContent[] $VALUES;
    public static final ScaffoldLayoutContent TopBar = new ScaffoldLayoutContent("TopBar", 0);
    public static final ScaffoldLayoutContent MainContent = new ScaffoldLayoutContent("MainContent", 1);
    public static final ScaffoldLayoutContent Snackbar = new ScaffoldLayoutContent("Snackbar", 2);
    public static final ScaffoldLayoutContent Fab = new ScaffoldLayoutContent("Fab", 3);
    public static final ScaffoldLayoutContent BottomBar = new ScaffoldLayoutContent("BottomBar", 4);

    private static final /* synthetic */ ScaffoldLayoutContent[] $values() {
        return new ScaffoldLayoutContent[]{TopBar, MainContent, Snackbar, Fab, BottomBar};
    }

    static {
        ScaffoldLayoutContent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private ScaffoldLayoutContent(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static ScaffoldLayoutContent valueOf(String str) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, str);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) $VALUES.clone();
    }
}
