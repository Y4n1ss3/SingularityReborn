package androidx.compose.material3;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldState {
    public static final int $stable = 0;
    private final SheetState bottomSheetState;
    private final SnackbarHostState snackbarHostState;

    public BottomSheetScaffoldState(SheetState sheetState, SnackbarHostState snackbarHostState) {
        this.bottomSheetState = sheetState;
        this.snackbarHostState = snackbarHostState;
    }

    public final SheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
